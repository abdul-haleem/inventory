package com.polaris.inventory.service.response;

import com.polaris.inventory.domain.Product;

public class ProductResponse {

	private String name;
	private String description;
	private Double unitprice;
	private Integer reorderLevel;
	private Integer reorderQuantity;
	private String status;
	private Long productType;
	
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
	
	public ProductResponse assemble(Product product)
	{
		ProductResponse productResponse = new ProductResponse();
		productResponse.setName(product.getName());
		productResponse.setDescription(product.getDescription());
		productResponse.setUnitprice(product.getUnitprice());
		productResponse.setReorderLevel(product.getReorderLevel());
		productResponse.setReorderQuantity(product.getReorderQuantity());
		productResponse.setStatus(product.getStatus());
		productResponse.setProductType(product.getProductType());
		return productResponse;
	}

}
