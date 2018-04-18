package com.polaris.inventory.domain;

import javax.persistence.*;

@Entity
@Table(name = "stock", schema = "polariserp")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CURRENT_STOCK")
    private Long currentStock;

    @Column(name = "STORE_ID")
    private Long storeId;
    
    @ManyToOne
    @JoinColumn(name="storeId",  foreignKey = @ForeignKey(name="fk_STOCK_LOCATION"))
    private StockLocation stockLocation;

    @OneToOne( mappedBy = "stock")
    private Product product;

	public Long getId() {
        return id;
    }

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
}
