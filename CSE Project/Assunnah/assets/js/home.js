document.addEventListener("DOMContentLoaded", function() {
    const slider = document.querySelector('.slider');
    const slides = document.querySelectorAll('.slider img');
    const totalSlides = slides.length;

    let index = 0;

    setInterval(() => {
        index++;
        if (index >= totalSlides) {
            index = 0;
        }
        slider.style.transform = `translateX(-${index * 100}%)`;
    }, 4000); // change every 2 seconds
});
