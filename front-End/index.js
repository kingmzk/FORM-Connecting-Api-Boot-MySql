document.getElementById('submit').addEventListener('click', function (e)
{
  e.preventDefault();

  let data = {
    name: document.getElementById("name").value,
    password: document.getElementById("password").value,
    email: document.getElementById("email").value,
    phone_number: document.getElementById("phone").value,
    department: document.getElementById("department").value
  }
  console.log(JSON.stringify(data));
  console.log("Data is inserted");
  fetch('http://localhost:8080/form/addform',  {
    method: "POST",
    body: JSON.stringify(data),
    headers: { "Content-type": "application/json; charset=UTF-8" }
  })
    .then(response => response.text())
    .then(json => console.log(json))
    .catch(err => console.log(err));
})