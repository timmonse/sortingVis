var sorts = {

    Model: [
        {
            "name": "Bubble Sort",
            "image": "https://i2.wp.com/abovethecrowd.com/wp-content/uploads/2014/01/bubbles-water-transparent-design.jpg?resize=1024%2C768",
            "page": "sorting.html",
            "value" : "BubbleSort",
        },
        {
            "name": "Selection Sort",
            "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Bubblesort-edited-color.svg/220px-Bubblesort-edited-color.svg.png",
            "page": "sorting.html",
            "value" : "SelectionSort",
        },
        {
            "name": "Merge Sort",
            "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Bubblesort-edited-color.svg/220px-Bubblesort-edited-color.svg.png",
            "page": "sorting.html",
            "value" : "MergeSort",
        },
        {
            "name": "Insertion Sort",
            "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Bubblesort-edited-color.svg/220px-Bubblesort-edited-color.svg.png",
            "page": "sorting.html",
            "value" : "InsertionSort",
        },
        {
            "name": "Quick Sort",
            "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Bubblesort-edited-color.svg/220px-Bubblesort-edited-color.svg.png",
            "page": "sorting.html",
            "value" : "QuickSort",
        },
        {
            "name": "Heap Sort",
            "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Bubblesort-edited-color.svg/220px-Bubblesort-edited-color.svg.png",
            "page": "sorting.html",
            "value" : "HeapSort",
        },


    ],

    // this function will display all algorithms on the page using model list
    displaySortCard: function () {
        let displayArea = document.getElementById('sorts-display');
        for (let i = 0; i < sorts.Model.length; i++) {
            let entry = sorts.createCard(sorts.Model[i]);
            displayArea.appendChild(entry);
        }
    },

    createCard: function (sort) {
        let entry = document.createElement('div');
        entry.className = 'card draw-border';

        entry.addEventListener('click', function () {
            localStorage.setItem("type", sort.value );
            window.document.location = sort.page;
        });

        let image = document.createElement('img');
        image.src = sort.image;
        image.className = 'card-image';
        let container = document.createElement('div');
        container.className='card-container'
        let name = document.createElement('p');
        name.className = 'card-sort-name-font';
        name.innerHTML = sort.name;
        container.appendChild(name);
        entry.appendChild(image);
        entry.appendChild(container);
        return entry;
    }
};