package com.polaris.inventory.service.request;

public class PageableSupplierRequest extends PageableRequest {


	private String firstName;
	private String LastName;
	
	public PageableSupplierRequest(String username, int limit, int pageNumber, String firstName, String lastName) {
		super(username, limit, pageNumber);
		this.firstName = firstName;
		LastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
}
