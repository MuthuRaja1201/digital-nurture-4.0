fetch("events.json")
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(err => console.error(err));
async function loadEvents() {
  try {
    document.querySelector("#spinner").style.display = "block";
    const response = await fetch("events.json");
    const data = await response.json();
    console.log(data);
  } catch (e) {
    console.error(e);
  } finally {
    document.querySelector("#spinner").style.display = "none";
  }
}
