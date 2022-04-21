var url = "http://localhost:8080/";


function request () {
	let request = document.getElementById("request").value
	let amount = document.getElementById("amount").value
	let description = document.getElementById("description").value
	empRequest(request, amount, description);
	
}

async function empRequest (request, amount, description) {
	let employee1 = {
		type: request,
		dollar: amount,
		describe: description 
		}
		
	let response = await fetch (url + 'request', {
		method: 'POST',
		headers: {'Content-Type': 'application/json'},
			body: JSON.stringify(employee1)});
		
		let result = await response.text();
		if (result.response == null) {
			alert("Request Sent!")
		}
			window.location.href="/table.html"
	}