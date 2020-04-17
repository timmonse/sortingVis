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
            "image": "https://marketingweek.imgix.net/content/uploads/2017/09/15160117/selection_750.jpg?auto=compress,format&q=60&w=750&h=460",
            "page": "sorting.html",
            "value" : "SelectionSort",
        },
        {
            "name": "Merge Sort",
            "image": "https://assets1.consumergoods.com/styles/content_sm/s3/2020-02/GettyImages-1019177936_0.jpg?itok=2XSZKfHH",
            "page": "sorting.html",
            "value" : "MergeSort",
        },
        {
            "name": "Insertion Sort",
            "image": "https://cdn2.iconfinder.com/data/icons/vending-machine/500/insert-512.png",
            "page": "sorting.html",
            "value" : "InsertionSort",
        },
        {
            "name": "Quick Sort",
            "image": "https://lh3.googleusercontent.com/proxy/d0IgwpN9edH0voOpjfvoQWEZ1gg5PKQ0nwdk6fCwDon90FCYtKy3Fwb1QTR9yqPHKRkng-ZqRCTRYOXJU2Et_KbEifDUwf8ltXLsvnmV9jSUO60rhhZA1jqj5P1LVV3J1Md8VR1Ni6Ko4DWw2OeqtGC-",
            "page": "sorting.html",
            "value" : "QuickSort",
        },
        {
            "name": "Heap Sort",
            "image": "https://blog.hubspot.com/hubfs/how-to-sort-in-excel.jpg",
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