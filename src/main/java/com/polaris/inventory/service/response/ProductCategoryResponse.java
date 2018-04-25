package com.polaris.inventory.service.response;

import com.polaris.inventory.domain.ProductCategory;

public class ProductCategoryResponse {

	private String code;
	private String name;
	private String description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
	
	public ProductCategoryResponse assemble(ProductCategory productCategory)
	{
		ProductCategoryResponse productCategoryResponse =  new ProductCategoryResponse();
		
		productCategoryResponse.setCode(productCategory.getCode());
		productCategoryResponse.setName(productCategory.getName());
		productCategoryResponse.setDescription(productCategory.getDescription());
		
		return productCategoryResponse;
		
	}

}
