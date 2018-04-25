package com.polaris.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polaris.inventory.domain.Product;
import com.polaris.inventory.domain.Stock;
import com.polaris.inventory.domain.StockLocation;
import com.polaris.inventory.repository.ProductRepository;
import com.polaris.inventory.repository.StockLocationRepository;
import com.polaris.inventory.repository.StockRepository;
import com.polaris.inventory.service.request.NewStockRequest;
import com.polaris.inventory.service.response.ServiceResponse;
import com.polaris.inventory.service.response.StockResponse;

@Service
public class StockService extends ServiceBase {

	@Autowired
	private StockRepository stockRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private StockLocationRepository stockLocationRepository;
	

	public ServiceResponse<?> createStock(NewStockRequest stockRequest)
	{
		
		Product product = productRepository.findById(stockRequest.getProductCode());		
		StockLocation stockLocation = stockLocationRepository.findByStoreId(stockRequest.getStoreId());
		
		Stock stock = modelObjectFactory.newStock(product,stockLocation,stockRequest);
		stock = stockRepository.save(stock);
		StockResponse stockResponse = new StockResponse();
		stockResponse = stockResponse.assemble(stock);
		response.setData(stockResponse);
		return response;
	}
	public ServiceResponse<?> getStockByProductCode(NewStockRequest stockRequest)
	{
		Stock stock = stockRepository.findByProductCode(stockRequest.getProductCode());
		response.setData(stock);
		return response;
		
	}
}
