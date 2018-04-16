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

    @Column(name = "PRODUCT_ID")
    private Long productId;


    public Long getId() {
        return id;
    }

    public Long getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(Long currentStock) {
        this.currentStock = currentStock;
    }


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stock stock = (Stock) o;

        if (id != stock.id) return false;
        if (productId != stock.productId) return false;
        if (currentStock != null ? !currentStock.equals(stock.currentStock) : stock.currentStock != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (currentStock != null ? currentStock.hashCode() : 0);
        result = 31 * result + (int) (productId ^ (productId >>> 32));
        return result;
    }
}
