async function runSort() {
    //get the initializing conditions from user input
    let size = parseInt(document.getElementById("array_size").value);
    let sortElement = document.getElementById("initial_select");

    //generate an array based on user input
    let arr = makeArray(size, sortElement);
    showArray(arr);

    //get the algorithm to be used to sort array from user and begin sorting
    let whichSort = document.getElementById("algorithm_select").value;
    if (whichSort === "BubbleSort")
        await bubble_sort(arr, showArray, checkPause);
    else if (whichSort === "SelectionSort")
        await selection_sort(arr, showArray, checkPause);
    else if (whichSort === "InsertionSort")
        await insertion_sort(arr, showArray, checkPause);
    else if (whichSort === "QuickSort")
        await quick_sort(arr, 0, size - 1);
    else if (whichSort === "HeapSort")
        await heap_sort(arr, showArray, checkPause);
    else
        await merge_sort(arr);
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

    //calculate the width of each bar by dividing the canvas width by the total number of bars that need drawn
    let width = canvas.width / arr.length;

    for (let i = 0; i < arr.length; i++)
    {
        //draw a bar for each array element
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
    let scaleFactor = 600/numElements;

    for (let i = 0; i < numElements; i++)
        result.push(i * scaleFactor);

    if (inputElement.value == "Random")
        result = shuffle(result);
    else if (inputElement.value == "Reversed")
        result.reverse();

    return result;
}

function shuffle(array) {
    let currentIndex = array.length, temporaryValue, randomIndex;

    // While there remain elements to shuffle...
    while (0 !== currentIndex) {

        // Pick a remaining element...
        randomIndex = Math.floor(Math.random() * currentIndex);
        currentIndex -= 1;

        // And swap it with the current element.
        temporaryValue = array[currentIndex];
        array[currentIndex] = array[randomIndex];
        array[randomIndex] = temporaryValue;
    }

    return array;
}

function getPivotIndex(arr, left, right)
{
    if (document.getElementById("pivot_select").value === "Random") {
        //return a random index between left and right
        var min=left;
        var max=right-1;
        return Math.floor(Math.random() * (+max - +min)) + +min;
    } else if (document.getElementById("pivot_select").value === "First") {
        // return the leftmost index provided
        return left;
    } else if (document.getElementById("pivot_select").value === "Middle") {
        //calculate and return the average of left and right, rounded down
        return Math.floor((right + left) / 2);
    } else if (document.getElementById("pivot_select").value === "Last") {
        //return the rightmost index provided
        return right-1;
    }

}

const sleep = (ms) => new Promise(resolve => setTimeout(resolve, ms));

function swap(arr, first_Index, second_Index) {
    var temp = arr[first_Index];
    arr[first_Index] = arr[second_Index];
    arr[second_Index] = temp;
}

async function bubble_sort(arr, drawFunc, waitFunc) {
    let len = arr.length;
    let i, j, stop;

    for (i = 0; i < len; i++) {
        for (j = 0, stop = len - i; j < stop; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                drawFunc(arr);
                await waitFunc();
            }
        }
    }

    return arr;
}

async function insertion_sort(arr, drawFunc, waitFunc) {
    for (let i = 1; i < arr.length; i++) {
        let j = i - 1;
        let temp = arr[i];
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            drawFunc(arr);
            await waitFunc();
            j--;
        }
        arr[j + 1] = temp;
        drawFunc(arr);
        await waitFunc();
    }

    return arr;
}

async function selection_sort(arr, drawFunc, waitFunc) {
    let len = arr.length;
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
            drawFunc(arr);
            await waitFunc();
        }
    }

    return arr;
}


async function quick_sort(items, left, right) {

    var index;

    if (items.length > 1) {

        index = await partition(items, left, right);

        if (left < index - 1) {
            quick_sort(items, left, index - 1);
        }

        if (index < right) {
            quick_sort(items, index, right);
        }
    }

    showArray(items);
    return items;
}

async function partition(items, left, right) {

    var pivot = items[getPivotIndex(items, left, right)];
    var i = left;
    var j = right;

    while (i <= j) {
        while (items[i] < pivot) {
            i++;
        }
        while (items[j] > pivot) {
            j--;
        }

        if (i <= j) {
            swap(items, i, j);
            showArray(items);
            await checkPause();
            i++;
            j--;
        }
    }

    return i;
}


function heap_sort(arr, drawFunc, waitFunc) {
	let length = arr.length;
	let i = Math.floor(length / 2 - 1);
	let k = length - 1;
	
	while(i >= 0) {
		heapify(arr, length, i, drawFunc, waitFunc);
		i--;
	}
	
	while(k >= 0) {
		[arr[0], arr[k]] = [arr[k], arr[0]];
		heapify(arr, k, 0, drawFunc, waitFunc);
		k--;
	}
	
	return arr;
}

async function heapify(arr, length, i, drawFunc, waitFunc) {
    let largest = i;
    let left = i * 2 + 1;
    let right = left + 1;

    if (left < length && arr[left] > arr[largest]) {
        largest = left;
    }

    if (right < length && arr[right] > arr[largest]) {
        largest = right;
    }

    if (largest != i) {
        [arr[i], arr[largest]] = [arr[largest], arr[i]];
        heapify(arr, length, largest, drawFunc, waitFunc);
    }
    drawFunc(arr);
    await waitFunc();
}

//This is an iterative version of merge sort because it is hard to show the array after each step of recursion.
async function merge_sort(arr) {
    var sorted = arr.slice(),
        n = sorted.length,
        buffer = new Array(n);

    for (var size = 1; size < n; size *= 2) {
        for (var leftStart = 0; leftStart < n; leftStart += 2 * size) {
            var left = leftStart,
                right = Math.min(left + size, n),
                leftLimit = right,
                rightLimit = Math.min(right + size, n),
                i = left;
            while (left < leftLimit && right < rightLimit) {
                if (sorted[left] <= sorted[right]) {
                    buffer[i++] = sorted[left++];
                } else {
                    buffer[i++] = sorted[right++];
                }

                showArray(sorted);
                await checkPause();
            }
            while (left < leftLimit) {
                buffer[i++] = sorted[left++];

                showArray(sorted);
                await checkPause();
            }
            while (right < rightLimit) {
                buffer[i++] = sorted[right++];

                showArray(sorted);
                await checkPause();
            }
        }

        var temp = sorted,
            sorted = buffer,
            buffer = temp;


        showArray(sorted);
        await checkPause();
    }

    return arr;
}

function initView() {
    console.log(localStorage.getItem("type"));
    let selectSort = document.getElementById("algorithm_select");
    for(let i =0; i< selectSort.length; i++){
        if(selectSort.options[i].value == localStorage.getItem("type")) {
            selectSort.selectedIndex = i;
            break;
        }
    }
}

module.exports.bubble_sort = bubble_sort;
module.exports.selection_sort = selection_sort;
module.exports.insertion_sort = insertion_sort;
module.exports.quick_sort = quick_sort;
module.exports.heap_sort = heap_sort;
module.exports.merge_sort = merge_sort;
module.exports.partition = partition;
