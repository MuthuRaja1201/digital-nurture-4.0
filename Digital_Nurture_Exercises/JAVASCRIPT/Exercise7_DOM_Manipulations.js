const container = document.querySelector("#eventsContainer");

function renderEvent(event) {
  const card = document.createElement("div");
  card.textContent = event.name;
  container.appendChild(card);
}
