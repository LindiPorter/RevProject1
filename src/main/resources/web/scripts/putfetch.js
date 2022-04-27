var url = "http://localhost:8080/";


function manFunction() {
	alert("Decision Made!")
	let id = document.getElementById("id").value
	let request = document.getElementById("request").value
	managerDecision (id, request);
	
}

async function managerDecision (id, request) {
	let manager1 = {
		id: id,
		accepted: request
		}
		
	let response = await fetch (url + 'update', {
		method: 'PUT',
		headers: {'Content-Type': 'application/json'},
			body: JSON.stringify(manager1)});
		
		let result = await response.json();
		alert("Decision Made")
	}