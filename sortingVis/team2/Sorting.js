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

function makeArray(numElements, isPreSorted)
{
    var result = [];

    for (var i = 0; i < numElements; i++)
        result.push(Math.floor(Math.random()*500));

    if (isPreSorted)
        result.sort();

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

function bubble_sort(arr) {
	var len = arr.length;
	var i, j, stop;
	
	for(i = 0; i < len; i++) {
		for(j = 0, stop = len - i; j < stop; j++) {
			if(arr[j] > arr[j+1]) {
				swap(arr, j, j+1);
				showArray(arr); //Our problem here is that it executes too fast. We need to delay it. Im thinking this should be another story.
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
		  j--;
		}
		arr[j+1] = temp;
	}
	showArray(arr);
}

function swap(arr, first_Index, second_Index){
    var temp = arr[first_Index];
    arr[first_Index] = arr[second_Index];
    arr[second_Index] = temp;
}