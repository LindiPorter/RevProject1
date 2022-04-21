var url = "http://localhost:8080/";

function login () {
	let username = document.getElementById("username").value
	let password = document.getElementById("password").value
	empLogin(username,password);
	
}

async function empLogin (username, password) {
	let employee = {
		username: username,
		password: password
		}
		
	let response = await fetch (url + 'login', {
		method: 'POST',
		headers: {'Content-Type': 'application/json'},
			body: JSON.stringify(employee)});
		
		let result = await response.json();
		if (result.username === null) {
			alert("Login Failure")
		} else {
			if (result.type == "manager") {
				window.location.href="/mgrtable.html"
			} else {
				window.location.href="/home.html"
			}
		}
			
	}
		
function logout () {
	window.location.href="http://localhost:8080/";
}


