var sorts = {

    Model: [
        {
            "name": "Bubble Sort",
            "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Bubblesort-edited-color.svg/220px-Bubblesort-edited-color.svg.png"
        },
        {
            "name": "Bubble Sort",
            "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Bubblesort-edited-color.svg/220px-Bubblesort-edited-color.svg.png"
        },
        {
            "name": "Bubble Sort",
            "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Bubblesort-edited-color.svg/220px-Bubblesort-edited-color.svg.png"
        },

    ],

    // this function will display all algorithms on the page using model list
    displaySortCard: function () {
        var displayArea = document.getElementById('sorts-display');
        for (var i = 0; i < sorts.Model.length; i++) {
            var entry = document.createElement('div');
            entry.className = 'card';
            var image = document.createElement('img');
            image.src = sorts.Model[i].image;
            image.className = 'card-image';
            var container = document.createElement('div');
            var name = document.createElement('p');
            name.className = 'card-sort-name-font';
            name.innerHTML = sorts.Model[i].name;
            container.appendChild(name);
            entry.appendChild(image);
            entry.appendChild(container);
            displayArea.appendChild(entry)
        }
    },

}