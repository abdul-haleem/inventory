package com.polaris.inventory.service.response;

import com.polaris.inventory.domain.Supplier;

public class SupplierResponse {

	private String companyName;
    private String firstName;
    private String lastName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String state;
    private String country;
    private String postcode;
    
    
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public SupplierResponse assemble(Supplier supplier)
	{
		SupplierResponse sr = new SupplierResponse();
		sr.setCompanyName(supplier.getCompanyName());
		sr.setFirstName(supplier.getFirstName());
		sr.setLastName(supplier.getLastName());
		sr.setPhone(supplier.getPhone());
		sr.setAddressLine1(supplier.getAddressLine1());
		sr.setAddressLine2(supplier.getAddressLine2());
		sr.setAddressLine3(supplier.getAddressLine3());
		sr.setCity(supplier.getCity());
		sr.setState(supplier.getState());
		sr.setCountry(supplier.getCountry());
		sr.setPostcode(supplier.getPostcode());
		
		return sr;
	}
}
