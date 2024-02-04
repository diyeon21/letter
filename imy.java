const yesButton = document.getElementById("yesButton");
const noButton = document.getElementById("noButton");

noButton.addEventListener("mouseover", () => {
    const maxX = window.innerWidth - noButton.clientWidth;
    const maxY = window.innerHeight - noButton.clientHeight;
    const randomX = Math.random() * maxX;
    const randomY = Math.random() * maxY;
    noButton.style.transform = `translate(${randomX}px, ${randomY}px)`;
});

yesButton.addEventListener("click", () => {
    alert("I'm glad to hear that!");
});

noButton.addEventListener("click", () => {
    alert("Aw, I'll try harder to make you smile!");
});
