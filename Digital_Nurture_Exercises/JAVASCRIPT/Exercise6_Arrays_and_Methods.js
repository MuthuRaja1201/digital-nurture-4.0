const eventsList = [];

eventsList.push({ name: "Yoga Class", category: "Health" });

const musicEvents = eventsList.filter(e => e.category === "Music");

const formattedCards = eventsList.map(e => `Event: ${e.name}`);
console.log(formattedCards);
