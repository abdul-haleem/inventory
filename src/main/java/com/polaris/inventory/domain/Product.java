package com.polaris.inventory.domain;

import javax.persistence.*;

@Entity
@Table(name = "product", schema = "polariserp")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODE")
    private String code;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "UNITPRICE")
    private Double unitprice;
    @Column(name = "REORDER_LEVEL")
    private Integer reorderLevel;
    @Column(name = "REORDER_QUANTITY")
    private Integer reorderQuantity;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "PRODUCT_TYPE")
    private Long productType;
    @Column(name = "SUPPLIERID")
    private Long supplierId;
    @Column(name = "BARCODE")
    private String barcode;

    @ManyToOne
    @JoinColumn(name = "supplierId", foreignKey = @ForeignKey (name = "fk_PRODUCT_SUPPLIER1"))
    private Supplier supplier;


    @ManyToOne
    @JoinColumn(name = "productType", foreignKey = @ForeignKey (name = "fk_PRODUCT_PRODUCT_TYPE"))
    private ProductCategory productCategory;



    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Integer reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public Integer getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(Integer reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getProductType() {
        return productType;
    }

    public void setProductType(Long productType) {
        this.productType = productType;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        if (code != null ? !code.equals(product.code) : product.code != null) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        if (unitprice != null ? !unitprice.equals(product.unitprice) : product.unitprice != null) return false;
        if (reorderLevel != null ? !reorderLevel.equals(product.reorderLevel) : product.reorderLevel != null)
            return false;
        if (reorderQuantity != null ? !reorderQuantity.equals(product.reorderQuantity) : product.reorderQuantity != null)
            return false;
        if (status != null ? !status.equals(product.status) : product.status != null) return false;
        if (productType != null ? !productType.equals(product.productType) : product.productType != null) return false;
        if (supplierId != null ? !supplierId.equals(product.supplierId) : product.supplierId != null) return false;
        return barcode != null ? barcode.equals(product.barcode) : product.barcode == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (unitprice != null ? unitprice.hashCode() : 0);
        result = 31 * result + (reorderLevel != null ? reorderLevel.hashCode() : 0);
        result = 31 * result + (reorderQuantity != null ? reorderQuantity.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        result = 31 * result + (supplierId != null ? supplierId.hashCode() : 0);
        result = 31 * result + (barcode != null ? barcode.hashCode() : 0);
        return result;
    }
}
