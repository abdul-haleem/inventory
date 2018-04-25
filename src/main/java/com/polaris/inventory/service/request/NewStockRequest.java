package com.polaris.inventory.service.request;

public class NewStockRequest  {
	
    private Long currentStock;
    private Long storeId;
    private String productCode;
    
	public Long getCurrentStock() {
		return currentStock;
	}
	public void setCurrentStock(Long currentStock) {
		this.currentStock = currentStock;
	}
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
   
}
