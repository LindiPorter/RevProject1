package com.lindi.project.main;

public class Reimbursements {
	@Override
	public String toString() {
		return "Reimbursements [id=" + id + ", employeeId=" + employeeId + ", managerId=" + managerId + ", request="
				+ request + ", amount=" + amount + ", description=" + description + ", resolved=" + resolved
				+ ", accepted=" + accepted + ", submissionTime=" + submissionTime + ", resolutionTime=" + resolutionTime
				+ "]";
	}
	private int id;
	private int employeeId;
	private int managerId;
	private String request;
	private double amount;
	private String description;
	private String resolved;
	private String accepted;
	private String submissionTime;
	private String resolutionTime;
	

	
	
	public String getSubmissionTime() {
		return submissionTime;
	}
	public void setSubmissionTime(String submissionTime) {
		this.submissionTime = submissionTime;
	}
	public String getResolutionTime() {
		return resolutionTime;
	}
	public void setResolutionTime(String resolutionTime) {
		this.resolutionTime = resolutionTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getResolved() {
		return resolved;
	}
	public void setResolved(String resolved) {
		this.resolved = resolved;
	}
	public String getAccepted() {
		return accepted;
	}
	public void setAccepted(String accepted) {
		this.accepted = accepted;
	}
	public Reimbursements() {
		super();
	}
	public Reimbursements(int id, int employeeId, int managerId, String request, double amount, String description,
			String resolved, String accepted, String resolutionTime, String submissionTime) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.managerId = managerId;
		this.request = request;
		this.amount = amount;
		this.description = description;
		this.resolved = resolved;
		this.accepted = accepted;
		this.resolutionTime = resolutionTime;
		this.submissionTime = submissionTime;
	}

	}
	
	
	



