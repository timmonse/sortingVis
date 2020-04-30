function initAudio() {
    let music = localStorage.getItem("music");
    var isPlaying = false;
    if (music == null) {
        isPlaying = false;
    } else if (music == "true") {
        isPlaying = true;
    }

    var audio;
    audio = new Audio("resources/music/jazzyfrenchy.mp3");
    audio.loop = true;
    let musicElement = document.getElementById("musicState");
    if (isPlaying) {
        audio.play();
        musicElement.className = "fa fa-volume-off fa-2x musicIcon ";
    }


    musicElement.addEventListener("click", function () {
        if (!isPlaying) {
            audio.play()
            musicElement.className = "fa fa-volume-off fa-2x musicIcon ";
            isPlaying = !isPlaying;
            localStorage.setItem("music", "true");
        } else {
            audio.pause();
            isPlaying = !isPlaying;
            musicElement.className = "fa fa-music fa-2x musicIcon";
            localStorage.setItem("music", "false");
        }
    });

}

