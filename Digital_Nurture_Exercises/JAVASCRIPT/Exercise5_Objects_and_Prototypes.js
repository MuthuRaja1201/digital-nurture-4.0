function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function() {
  return this.seats > 0;
}

const concert = new Event("Concert", "2025-05-20", 10);
console.log(Object.entries(concert));
