package com.polaris.inventory.service.request;

public class PageableProductRequest extends PageableRequest {

	private String name;
	private String description;
	
	public PageableProductRequest(int limit, int pageNumber,String name, String description) {
		super(limit, pageNumber);
		this.name = name;
		this.description = description;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	

}
