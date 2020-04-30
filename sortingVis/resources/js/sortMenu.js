var sorts = {

    Model: [
        {
            "name": "Bubble Sort",
            "image": "resources/images/bubbleSortPic.jpg",
            "page": "sorting.html",
            "value" : "BubbleSort",
        },
        {
            "name": "Selection Sort",
            "image": "resources/images/selectionSortPic.jpg",
            "page": "sorting.html",
            "value" : "SelectionSort",
        },
        {
            "name": "Merge Sort",
            "image": "resources/images/mergeSortPic.jpg",
            "page": "sorting.html",
            "value" : "MergeSort",
        },
        {
            "name": "Insertion Sort",
            "image": "resources/images/insertionSortPic.jpg",
            "page": "sorting.html",
            "value" : "InsertionSort",
        },
        {
            "name": "Quick Sort",
            "image": "resources/images/quickSortPic.jpg",
            "page": "sorting.html",
            "value" : "QuickSort",
        },
        {
            "name": "Heap Sort",
            "image": "resources/images/heapSortPic.jpg",
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
    },

    initPage: function () {
        let music = localStorage.getItem("music");
        var isPlaying = false;
        if(music == null){
            isPlaying =false;
        }
        else if (music == "true"){
            isPlaying= true;
        }

        var audio;
        audio = new Audio("resources/music/jazzyfrenchy.mp3");
        audio.loop = true;
        let musicElement = document.getElementById("musicState");
        if(isPlaying){
            audio.play();
            musicElement.className = "fa fa-volume-off fa-2x musicIcon ";
        }


        musicElement.addEventListener("click", function () {
            if(!isPlaying){
                audio.play()
                musicElement.className = "fa fa-volume-off fa-2x musicIcon ";
                isPlaying = !isPlaying;
                localStorage.setItem("music", "true");
            }
            else{
                audio.pause();
                isPlaying = !isPlaying;
                musicElement.className = "fa fa-music fa-2x musicIcon";
                localStorage.setItem("music", "false");
            }
        });

    }
};