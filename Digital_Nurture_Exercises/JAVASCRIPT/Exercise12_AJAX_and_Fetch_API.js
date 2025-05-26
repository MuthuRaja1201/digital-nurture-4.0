function submitRegistration(userData) {
  fetch("https://example.com/api/register", {
    method: "POST",
    body: JSON.stringify(userData),
    headers: { "Content-Type": "application/json" }
  })
    .then(res => res.json())
    .then(data => alert("Registration Successful!"))
    .catch(err => alert("Failed to register."))
    .finally(() => {
      setTimeout(() => console.log("Response received"), 1000);
    });
}
