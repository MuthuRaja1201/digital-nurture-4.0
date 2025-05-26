const eventObj = { name: "Fair", date: "2025-07-10" };
const { name, date } = eventObj;

const newList = [...eventsList];

function greet(user = "Guest") {
  console.log(`Hello, ${user}`);
}
