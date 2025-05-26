const events = [
  { name: "Music Fest", date: "2025-06-10", seats: 5 },
  { name: "Book Fair", date: "2024-04-01", seats: 0 }
];

events.forEach(event => {
  if (new Date(event.date) > new Date() && event.seats > 0) {
    console.log(`Upcoming: ${event.name}`);
  }
});

function registerEvent(event) {
  try {
    if (event.seats > 0) {
      event.seats--;
      console.log(`Registered for ${event.name}`);
    } else {
      throw new Error("No seats left");
    }
  } catch (error) {
    console.error(error.message);
  }
}
