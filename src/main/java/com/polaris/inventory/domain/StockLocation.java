package com.polaris.inventory.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "stock_location", schema = "polariserp")
public class StockLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "OPERATIONAL")
    private String operational;
    
    @OneToMany(mappedBy="stockLocation")
    private List<Stock>stocks ;

	public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOperational() {
        return operational;
    }

    public void setOperational(String operational) {
        this.operational = operational;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
}
