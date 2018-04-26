package com.polaris.inventory.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.polaris.inventory.domain.Supplier;
import com.polaris.inventory.repository.SupplierRepository;
import com.polaris.inventory.service.request.NewSupplierRequest;
import com.polaris.inventory.service.request.PageableSupplierRequest;
import com.polaris.inventory.service.response.ServiceResponse;
import com.polaris.inventory.service.response.SupplierResponse;

@Service
public class SupplierService extends ServiceBase {

	@Autowired
	private SupplierRepository supplierRepository;

	public ServiceResponse<?> createSupplier(NewSupplierRequest supplierRequest) {
		Supplier supplier = modelObjectFactory.newSupplier(supplierRequest);
		supplier = supplierRepository.save(supplier);
		SupplierResponse supplierResponse = new SupplierResponse();
		supplierResponse = supplierResponse.assemble(supplier);
		response.setData(supplierResponse);
		return response;
	}

	public ServiceResponse<?> getAllsuppliers(PageableSupplierRequest pageableSupplierRequest) {
		
		Supplier supplier = new Supplier();
		supplier.setFirstName(pageableSupplierRequest.getFirstName());
		supplier.setLastName(pageableSupplierRequest.getLastName());
		Example<Supplier> criteria = Example.of(supplier);
		Pageable pageable = PageRequest.of(pageableSupplierRequest.getPageNumber(), pageableSupplierRequest.getLimit());
		Page<Supplier> supplierResponse = supplierRepository.findAll(criteria, pageable);
		response.setData(supplierResponse);
		return response;
	}
	public ServiceResponse<?> getSupplierByNameandPhone(NewSupplierRequest supplierRequest)
	{
		Supplier supplier = new Supplier();
		supplier.setFirstName(supplierRequest.getFirstName());
		supplier.setPhone(supplierRequest.getPhone());
		Example<Supplier> criteria = Example.of(supplier);
		Optional<Supplier> sup = supplierRepository.findOne(criteria);
		response.setData(sup);
		return response;
		
	}
	

}
