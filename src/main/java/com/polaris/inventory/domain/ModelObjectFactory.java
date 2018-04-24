package com.polaris.inventory.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.polaris.inventory.service.request.NewProductCategory;
import com.polaris.inventory.service.request.NewProductRequest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ModelObjectFactory {
	
	public Product newProduct(NewProductRequest productRequest) 
	{
		Product product = new Product();
		
		product.setName(productRequest.getName());
		product.setDescription(productRequest.getDescription());
		product.setUnitprice(productRequest.getUnitprice());
		product.setReorderLevel(productRequest.getReorderLevel());
		product.setReorderQuantity(productRequest.getReorderQuantity());
		product.setStatus(productRequest.getStatus());
		product.setProductType(productRequest.getProductType());
		
		return product;
	}
	
	public ProductCategory newProductCategory(NewProductCategory newProductCategory, ProductCategory Parent)
	{
		ProductCategory productCategory = new ProductCategory();
		
		productCategory.setName(newProductCategory.getName());
		productCategory.setDescription(newProductCategory.getDescription());
		productCategory.setParent(Parent);
		
		return productCategory;
	}
	

}
