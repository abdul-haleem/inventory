package com.polaris.inventory.service.request;

public abstract class PageableRequest extends ServiceRequest {

	private int limit;
	private int pageNumber;
	
	
	public PageableRequest(String username, int limit, int pageNumber) {
		this.limit = limit;
		this.pageNumber = pageNumber;
	}
	public PageableRequest(int limit, int pageNumber) {
		this.limit = limit;
		this.pageNumber = pageNumber;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
}
