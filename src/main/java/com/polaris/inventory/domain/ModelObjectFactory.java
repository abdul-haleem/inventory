package com.polaris.inventory.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.polaris.inventory.service.request.NewProductCategory;
import com.polaris.inventory.service.request.NewProductCategoryRequest;
import com.polaris.inventory.service.request.NewProductRequest;
import com.polaris.inventory.service.request.NewStockRequest;
import com.polaris.inventory.service.request.NewSupplierRequest;
import com.polaris.inventory.service.request.NewUserRequest;

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
	
	public Supplier newSupplier(NewSupplierRequest supplierRequest) 
	{
		Supplier supplier = new Supplier();
		supplier.setCompanyName(supplierRequest.getCompanyName());
		supplier.setFirstName(supplierRequest.getFirstName());
		supplier.setLastName(supplierRequest.getLastName());
		supplier.setPhone(supplierRequest.getPhone());
		supplier.setAddressLine1(supplierRequest.getAddressLine1());
		supplier.setAddressLine2(supplierRequest.getAddressLine2());
		supplier.setAddressLine3(supplierRequest.getAddressLine3());
		supplier.setCity(supplierRequest.getCity());
		supplier.setCountry(supplierRequest.getCountry());
		supplier.setPostcode(supplierRequest.getPostcode());
		
		return supplier;
	}
	
	public Stock newStock(Product product, StockLocation stockLocation, NewStockRequest stockRequest ) 
	{
	
		Stock stock = new Stock();
		
		stock.setCurrentStock(stockRequest.getCurrentStock());
		stock.setStockLocation(stockLocation);
		stock.setProduct(product);
		
		return stock;
	}
	public ProductCategory newProductCategory(NewProductCategoryRequest productCategoryRequest)
	{
		ProductCategory productCategory = new ProductCategory();
		productCategory.setCode(productCategoryRequest.getCode());
		productCategory.setName(productCategoryRequest.getName());
		productCategory.setDescription(productCategoryRequest.getDescription());
		
		return productCategory;
	}
	
	public User newUser(NewUserRequest userRequest)
	{
		User user = new User();
		user.setUsername(userRequest.getUsername());
		user.setFirstname(userRequest.getUsername());
		user.setLastname(userRequest.getUsername());
		user.setPassword(userRequest.getPassword());
		user.setEmail(userRequest.getEmail());
		user.setEnabled(userRequest.getEnabled());
		
		return user;
	}

}
