package com.polaris.inventory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.polaris.inventory.domain.Product;
import com.polaris.inventory.repository.ProductRepository;
import com.polaris.inventory.service.request.NewProductRequest;
import com.polaris.inventory.service.request.PageableProductRequest;
import com.polaris.inventory.service.request.ServiceRequest;
import com.polaris.inventory.service.response.ProductResponse;
import com.polaris.inventory.service.response.ServiceResponse;

@Service
public class ProductService extends ServiceBase{
	
	@Autowired
	private ProductRepository productRepository;

	public ServiceResponse<?> createProduct(NewProductRequest productRequest)
	{
		Product pd = modelObjectFactory.newProduct(productRequest);
		pd = productRepository.save(pd);
		ProductResponse productResponse = new ProductResponse();
		productResponse = productResponse.assemble(pd);
		response.setData(productResponse);
		return response;
		
	}
	public ServiceResponse<?> getAllproducts(PageableProductRequest pageableProductRequest)
	{
		Product pd = new Product();
		pd.setName(pageableProductRequest.getName());
		pd.setDescription(pageableProductRequest.getDescription());
		
		Example<Product> criteria = Example.of(pd);

	    Pageable pageable = PageRequest.of(pageableProductRequest.getPageNumber(),pageableProductRequest.getLimit());

		Page<Product> products = productRepository.findAll(criteria,pageable);
		response.setData(products);
		return response;
	}
	public ServiceResponse<?> getProductByBarCode(NewProductRequest productRequest)
	{
		Product pd = new Product();
		pd.setBarcode(productRequest.getBarcode());
		Example<Product> criteria = Example.of(pd);
		Optional<Product> product = productRepository.findOne(criteria);
		response.setData(product);
		return response;
		
	}
	
}
