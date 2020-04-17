function runSort()
{
    var size = parseInt(document.getElementById("array_size").value);
    var sortElement = document.getElementById("initial_select");
    var arr = makeArray(size, sortElement);
    showArray(arr);

    var whichSort = document.getElementById("algorithm_select").value;

    if (whichSort == "BubbleSort")
        animatedBubbleSort(arr)
    else if (whichSort == "SelectionSort")
        selection_sort(arr);
    else if (whichSort == "InsertionSort")
        insertion_sort(arr);
    else if (whichSort == "QuickSort")
        quick_sort(arr, 0, size-1);
    else if (whichSort == "HeapSort")
        heap_sort(arr);
    else
        merge_sort(arr)
}

function showArray(arr)
{
    //initialize canvas
    var fillColor = "#A9A9A9";
    var canvas = document.getElementById("main_canvas");
    var context = canvas.getContext('2d');
    context.fillStyle = '#fff';
    context.fillRect(0, 0, canvas.width, canvas.height);
    context.strokeRect(0, 0, canvas.width, canvas.height);

    var width = canvas.width / arr.length;

    for (var i = 0; i < arr.length; i++)
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
    var result = [];

    for (var i = 0; i < numElements; i++)
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

function wait(ms)
{
    var d = new Date();
    var d2 = null;
    while(d2-d < ms)
    {
        d2 = new Date();
    }
}

function swap(arr, first_Index, second_Index) {
    var temp = arr[first_Index];
    arr[first_Index] = arr[second_Index];
    arr[second_Index] = temp;
}

function animatedBubbleSort(items) {
    var i = 0;
    var j = 0;
    var length = items.length;

    (function nextIteration() {
        if (j >= length - i - 1) {
            j = 0;
            i++;
        }
        if (i < length) {
            if (items[j] > items[j + 1]) {
                swap(items, j, j+1);
                showArray(items, j + 1);
            }
            j++;
            setTimeout(nextIteration, 100);
        }
        else {
            showArray(items);
        }
    })();
}

function bubble_sort(arr) {
	var len = arr.length;
	var i, j, stop;
	
	for(i = 0; i < len; i++) {
		for(j = 0, stop = len - i; j < stop; j++) {
			if(arr[j] > arr[j+1]) {
				swap(arr, j, j+1);
				showArray(arr);
			}
		}
	}
}

function insertion_sort(arr) {
	for (var i = 1; i < arr.length; i++) {
		var j = i - 1;
		var temp = arr[i];
		while (j >= 0 && arr[j] > temp) {
		  arr[j + 1] = arr[j];
		  showArray(arr);
		  j--;
		}
		arr[j+1] = temp;
        showArray(arr);
	}
}

function selection_sort(arr) {
    var len = arr.length
    var min;

    for (i=0; i < len; i++){
        min = i;

        for (j=i+1; j < len; j++){
            if (arr[j] < arr[min]){
                min = j;
            }
        }

        if (i != min){
            swap(arr, i, min);
            showArray(arr);
        }
    }
}

function quick_sort(arr, left, right) {
    if(left < right)
    {
        let pivot = partition(arr, left, right);

        quick_sort(arr, left, pivot - 1);
        quick_sort(arr, pivot + 1, right)
    }
}

function partition(arr, leftIndex, rightIndex) {
    var pivot = rightIndex;
    var i = leftIndex - 1;
    var j = leftIndex;

    while (j < pivot)
    {
        if (arr[j] > arr[pivot])
        {
            j++
        }

        else
        {
            i++;
            swap(arr, j, i);
            j++
        }
    }

    swap(arr, i + 1, pivot);
    showArray(arr);

    return i + 1
}

function heap_sort(arr) {

}

function merge_sort(arr) {

}
