function addEvent(name, date, seats, category) {
  return { name, date, seats, category };
}

function registerUser(event) {
  if (event.seats > 0) event.seats--;
}

function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}

// Closure for total registrations per category
function createCategoryTracker() {
  const counts = {};
  return function(category) {
    counts[category] = (counts[category] || 0) + 1;
    console.log(`${counts[category]} registrations in ${category}`);
  }
}

const trackRegistration = createCategoryTracker();
trackRegistration("Music");
