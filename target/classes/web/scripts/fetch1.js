var url = "http://localhost:8080/";


function imafunction() {
	alert("Request Sent!")
	let request = document.getElementById("request").value
	let amount = document.getElementById("amount").value
	let description = document.getElementById("description").value
	empRequest(request, amount, description);
	
}

async function empRequest (request, amount, description) {
	let employee1 = {
		request: request,
		amount: amount,
		description: description 
		}
		
	let response = await fetch (url + 'request', {
		method: 'POST',
		headers: {'Content-Type': 'application/json'},
			body: JSON.stringify(employee1)});
		
		let result = await response.json();
		alert("Request Sent")
	}