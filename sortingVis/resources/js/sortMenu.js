var sorts = {

    Model: [
        {
            "name": "Bubble Sort",
            "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Bubblesort-edited-color.svg/220px-Bubblesort-edited-color.svg.png",
            "page": "sorting.html"
        },
        {
            "name": "Bubble Sort",
            "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Bubblesort-edited-color.svg/220px-Bubblesort-edited-color.svg.png",
            "page": "sorting.html"
        },
        {
            "name": "Bubble Sort",
            "image": "https://upload.wikimedia.org/wikipedia/commons/thumb/8/83/Bubblesort-edited-color.svg/220px-Bubblesort-edited-color.svg.png",
            "page": "sorting.html"
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
        let entry = document.createElement('a');
        entry.className = 'card draw-border';
        entry.href = sort.page;
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