# RevProject1
# Employee Reimbursement System

## Project Description
For Project 1, I developed an employee expense reimbursement system based upon the guidelines given. This was a full stack application showcasing both front and back end capabilities. In this project, I used a variety of technologies and languages to achieve the requirements. An employee with specific login information can create an expense request including details about the desire for reimbursement. Then, a manager logs in with their own credentials and either accepts or denies the request. Both employee and manager is able to view past and pending requests, which will be updated upon the managere's decision. 

## Technologies Used
  * Java - version 1.8
  * Javalin - version 4.3.0
  * JUnit - version 5.8.2
  * Cucumber - version 7.2.3
  * Selenium - version 4.1.1
  * Mockito - version 4.4.0
  * PostgreSQL - version 42.3.1
  * HTML, JavaScript, CSS, Bootstrap
  
## Features
Below are the features currently implemented in this system. Following these features is a list of tasks to develop which will improve the functionality of the system.

  1. Employee logs in with corresponding username and password.
  2. Employee creates an expense request including type, amount, and description of request.
  3. Employee can view all requests past and pending for specific employee id.
  4. Manager logs in with corresponding username and password.
  5. Manager can view all requests for all employees.
  6. Manager decides whether to accept or deny a specific request id.
  7. Tables update based upon the manager's decision.
  
  ### To do List
  1. Employee can view specific status of request separate from entire table of requests.
  2. Employee can delete request before approval.
  3. Manager can approve or deny specific request based on request id.
  4. Manager can view a statistics page based on how many requests an employee submits and mean expenditure costs.
  5. Employee can upload documents to support request submission.


## Getting Started
* Open GitHub.
* Go to repository page: [LindiPorter/RevProject1](https://github.com/LindiPorter/RevProject1).
* Select clone button.
* Copy the code with HTTPS ``https://github.com/LindiPorter/RevProject1.git``.
* Open GitBash terminal.
* Access working directory using command ``-cd`` <directory-name>.
* Clone local repository using ``$ git clone <url>`` and press enter.
* Use ``ls`` command and press enter to check that the files are in the right directory.

## Usage
* Run MainApp as a Java Application. ![Screenshot (2)](https://user-images.githubusercontent.com/101131753/165631658-a0d47611-e2fa-4fb8-932b-c73e80cc5055.png)
* Javalin should open https://localhost:8080/.
* Copy this link into desired browser to navigate to the homepage. ![homepage](https://user-images.githubusercontent.com/101131753/165634501-481f7aab-b21a-479f-a69a-5d3f1e470343.png)
* Login with employee username and password.
* Use buttons to navigate through pages. 
* Submit employee request. ![employeepage](https://user-images.githubusercontent.com/101131753/165634675-f48aec53-07c8-44b0-9f99-63ff4a994956.png)
* Return to table to view past and pending requests. ![employeetable](https://user-images.githubusercontent.com/101131753/165634821-4045e219-7026-46d6-b153-be087978dfd5.png)
* Logout as employee. 
* Log in with manager username and password.
* Use buttons to navigate through pages.
* Enter id number of request, accept or deny, then submit decision. ![managerpage](https://user-images.githubusercontent.com/101131753/165635136-cef01f37-352d-485e-b1a6-d4ccfefc6680.png)
* Return to table to view all requests from all employees. ![managertable](https://user-images.githubusercontent.com/101131753/165635241-8e30aaa9-a29d-496d-9f75-6dabcdc487f5.png)
* Logout. 
 
## License
This project uses the following license: [LICENSE.txt](https://github.com/LindiPorter/RevProject1/files/8577783/LICENSE.txt)
