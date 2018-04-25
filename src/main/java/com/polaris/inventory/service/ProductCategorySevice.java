package com.polaris.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polaris.inventory.domain.Product;
import com.polaris.inventory.domain.ProductCategory;
import com.polaris.inventory.repository.ProductCategoryRepository;
import com.polaris.inventory.service.request.NewProductCategoryRequest;
import com.polaris.inventory.service.request.NewProductRequest;
import com.polaris.inventory.service.response.ProductCategoryResponse;
import com.polaris.inventory.service.response.ProductResponse;
import com.polaris.inventory.service.response.ServiceResponse;

@Service
public class ProductCategorySevice extends ServiceBase {
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	public ServiceResponse<?> createProductCategory(NewProductCategoryRequest productCategoryRequest)
	{
		ProductCategory productCategory = modelObjectFactory.newProductCategory(productCategoryRequest);
		productCategory = productCategoryRepository.save(productCategory);
		ProductCategoryResponse productCategoryResponse = new ProductCategoryResponse();
		productCategoryResponse = productCategoryResponse.assemble(productCategory);
		response.setData(productCategoryResponse);
		return response;
		
	}

}
