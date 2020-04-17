async function runSort() {
    let size = parseInt(document.getElementById("array_size").value);
    let sortElement = document.getElementById("initial_select");
    let arr = makeArray(size, sortElement);
    showArray(arr);

    let whichSort = document.getElementById("algorithm_select").value;

    if (whichSort === "BubbleSort")
        await bubble_sort(arr);
    else if (whichSort === "SelectionSort")
        await selection_sort(arr);
    else if (whichSort === "InsertionSort")
        await insertion_sort(arr);
    else if (whichSort === "QuickSort")
        await quick_sort(arr, 0, size - 1);
    else if (whichSort === "HeapSort")
        await heap_sort(arr);
    else
        await merge_sort(arr)
}

function myFunction() {
    let start = document.getElementById("start_btn");
    let play = document.getElementById("play_btn");
    let pause = document.getElementById("pause_btn");
    if (start.style.visibility === "hidden") {
        start.style.visibility = "visible";
    } else {
        start.style.visibility = "hidden";
    }

    play.style.visibility = "visible";
    pause.style.visibility = "visible";
}

let speed = 0;
window.onload = function() {
    let slider = document.getElementById("slider");

    speed = 0; //variable to be controlled

    let dispDiv = document.getElementById("dispDiv");
    dispDiv.innerHTML = "" + (100 - speed);

    //Real time interval adjustment
    setInterval(function() {
        speed = slider.value;
      dispDiv.innerHTML = "" + (100 - speed);
    }, 100)
}

let isPause = 0;

async function pauseSort(){
    isPause = 1;
}

async function playSort(){
    isPause = 0;
}

async function checkPause(){
    while(isPause){
        await sleep(speed);
    }
    await sleep(speed);
}

function showArray(arr)
{
    //initialize canvas
    let fillColor = "#A9A9A9";
    let canvas = document.getElementById("main_canvas");
    let context = canvas.getContext('2d');
    context.fillStyle = '#fff';
    context.fillRect(0, 0, canvas.width, canvas.height);
    context.strokeRect(0, 0, canvas.width, canvas.height);

    let width = canvas.width / arr.length;

    for (let i = 0; i < arr.length; i++)
    {
        drawBar(context, i * width, canvas.height - arr[i], width, arr[i], fillColor);
    }
}

function drawLine(ctx, startX, startY, endX, endY, color)
{
    ctx.save();
    ctx.strokeStyle = color;
    ctx.beginPath();
    ctx.moveTo(startX, startY);
    ctx.lineTo(endX, endY);
    ctx.stroke();
    ctx.restore();
}

function drawBar(ctx, upperLeftCornerX, upperLeftCornerY, width, height, color)
{
    ctx.save();
    ctx.fillStyle = color;
    ctx.fillRect(upperLeftCornerX, upperLeftCornerY, width, height);
    ctx.restore();
}

function makeArray(numElements, inputElement)
{
    let result = [];

    for (let i = 0; i < numElements; i++)
        result.push(Math.floor(Math.random()*500));

    if (inputElement.value != "Random")
        result.sort();
    if (inputElement.value == "Reversed")
        result.reverse();

    return result;
}

function checkIfNeedsPivot()
{
    if (document.getElementById("algorithm_select").value === "QuickSort" || document.getElementById("algorithm_select").value === "MergeSort")
    {
        document.getElementById("pivot_label").style.visibility = "visible";
        document.getElementById("pivot_select").style.visibility = "visible";
    }
    else
    {
        document.getElementById("pivot_label").style.visibility = "hidden";
        document.getElementById("pivot_select").style.visibility = "hidden";
    }
}

const sleep = (ms) => new Promise(resolve => setTimeout(resolve, ms))

function swap(arr, first_Index, second_Index) {
    let temp = arr[first_Index];
    arr[first_Index] = arr[second_Index];
    arr[second_Index] = temp;
}

async function bubble_sort(arr) {
    let len = arr.length;
    let i, j, stop;

    for (i = 0; i < len; i++) {
        for (j = 0, stop = len - i; j < stop; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                showArray(arr);
                await checkPause();
            }
        }
    }
}

async function insertion_sort(arr) {
    for (let i = 1; i < arr.length; i++) {
        let j = i - 1;
        let temp = arr[i];
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            showArray(arr);
            await checkPause();
            j--;
        }
        arr[j + 1] = temp;
        showArray(arr);
        await checkPause();
    }
}

async function selection_sort(arr) {
    let len = arr.length
    let min;

    for (i = 0; i < len; i++) {
        min = i;

        for (j = i + 1; j < len; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }

        if (i != min) {
            swap(arr, i, min);
            showArray(arr);
            await checkPause();
        }
    }
}

async function quick_sort(arr, left, right) {
    if(left < right)
    {
        let pivot = await partition(arr, left, right);

        await quick_sort(arr, left, pivot - 1);
        await quick_sort(arr, pivot + 1, right)
    }
}

async function partition(arr, leftIndex, rightIndex) {
    let pivot = rightIndex;
    let i = leftIndex - 1;
    let j = leftIndex;

    while (j < pivot) {
        if (arr[j] > arr[pivot]) {
            j++
        } else {
            i++;
            swap(arr, j, i);
            j++
        }
    }

    swap(arr, i + 1, pivot);
    showArray(arr);
    await checkPause();

    return i + 1
}

function heap_sort(arr) {

}

function merge_sort(arr) {

}


function initView() {
    console.log(localStorage.getItem("type"));
    let selectSort = document.getElementById("algorithm_select");
    for(let i =0; i< selectSort.length; i++){
        if(selectSort.options[i].value == localStorage.getItem("type"))
            selectSort.selectedIndex = i;
    }
}