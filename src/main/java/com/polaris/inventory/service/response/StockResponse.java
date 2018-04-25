package com.polaris.inventory.service.response;

import com.polaris.inventory.domain.Product;
import com.polaris.inventory.domain.Stock;
import com.polaris.inventory.domain.StockLocation;

public class StockResponse {

	private Long currentStock;
	private Long storeId;
	private StockLocation stockLocation;
	private Product product;

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

	public StockLocation getStockLocation() {
		return stockLocation;
	}

	public void setStockLocation(StockLocation stockLocation) {
		this.stockLocation = stockLocation;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public StockResponse assemble(Stock stock)
	{
		StockResponse stockResponse = new StockResponse();
		stockResponse.setCurrentStock(stock.getCurrentStock());
		stockResponse.setStoreId(stock.getStoreId());
		stockResponse.setStockLocation(stock.getStockLocation());
		stockResponse.setProduct(stock.getProduct());
	
		return stockResponse;
	}

}
