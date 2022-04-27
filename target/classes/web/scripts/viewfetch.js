var url = "http://localhost:8080/reimbemp";


function temployeeRequest() {
   	//alert("Request Sent!");
    fetch(url)
    .then(response => response.json()) 
    .then(json => displayData(json))    
    .catch(err => console.log('Request Failed', err));
}

function displayData(response) {
 	//alert("heyyyy");
var len = response.length;
const table = document.getElementById("testtable");

for (var i=0; i < len; i++) {
    var tr = document.createElement('tr');
    var s = response[i];
    console.log("test");

    var td = document.createElement('td');
    td.innerHTML = s.id;
    tr.appendChild(td);

    td = document.createElement('td');
    td.innerHTML = s.employeeId;
    tr.appendChild(td);

    td = document.createElement('td');
    td.innerHTML = s.managerId;
    tr.appendChild(td);

    td = document.createElement('td');
    td.innerHTML = s.request;
    tr.appendChild(td);

    td = document.createElement('td');
    td.innerHTML = s.amount;
    tr.appendChild(td);
    
    td = document.createElement('td');
    td.innerHTML = s.description;
    tr.appendChild(td);
    
    td = document.createElement('td');
    td.innerHTML = s.resolved;
    tr.appendChild(td);
    
    td = document.createElement('td');
    td.innerHTML = s.accepted;
    tr.appendChild(td);
    
    td = document.createElement('td');
    td.innerHTML = s.submissionTime;
    tr.appendChild(td);
    
    td = document.createElement('td');
    td.innerHTML = s.resolutionTime;
    tr.appendChild(td);

    table.appendChild(tr);
}
}
