package com.polaris.inventory.domain;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockLocation that = (StockLocation) o;

        if (id != that.id) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (operational != null ? !operational.equals(that.operational) : that.operational != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (operational != null ? operational.hashCode() : 0);
        return result;
    }
}
