function showArray(canvas, arr, color)
{
    //initialize canvas
    var context = canvas.getContext('2d');
    context.fillStyle = '#fff';
    context.fillRect(0, 0, canvas.width, canvas.height);
    context.strokeRect(0, 0, canvas.width, canvas.height);

    //get min an max elements
    var min = arr[0];
    var max = arr[0];
    for (var i = 1; i < arr.length; i++)
    {
        if (arr[i] > max)
            max = arr[i];
        else if (arr[i] < min)
            min = arr[i];
    }

    //find what size to draw graph elements
    var spacing = canvas.width / (3*arr.length + 1);
    var bar_width = spacing * 2;

    //translate y values in the array relative to the canvas
    function getY(y)
    {
        //getY(max) should = 0
        //getY(min) should = canvas height
        var a = canvas.height / (min - max);
        var b = max * canvas.height / (max - min);
        return a * y + b;
    }

    //draw zero line
    var zero = convert_y(0);
    context.beginPath();
    context.moveTo(0, zero);
    context.lineTo(canvas.width, zero);
    context.stroke();

    //draw array
    var x = spacing;
    for (var i = 0; i < arr.length; i++)
    {
        context.fillStyle = colors[i];
        var y = convert_y(arr[i]);
        if (arr[i] >= 0)
        {
            context.fillRect(x, y, bar_width, zero - y);
        }
        else
        {
            context.fillRect(x, zero, bar_width, y - zero);
        }
        x += spacing + bar_width;
    }
}