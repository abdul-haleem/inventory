package com.polaris.inventory.service.request;

public class NewProductRequest extends ServiceRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7496827209751245719L;
	
	private String name;
	private String description;
	private Double unitprice;
	private Integer reorderLevel;
	private Integer reorderQuantity;
	private String status;
	private Long productType;
	private String barcode;
	
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
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
	public Double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(Double unitprice) {
		this.unitprice = unitprice;
	}
	public Integer getReorderLevel() {
		return reorderLevel;
	}
	public void setReorderLevel(Integer reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	public Integer getReorderQuantity() {
		return reorderQuantity;
	}
	public void setReorderQuantity(Integer reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getProductType() {
		return productType;
	}
	public void setProductType(Long productType) {
		this.productType = productType;
	}

}
