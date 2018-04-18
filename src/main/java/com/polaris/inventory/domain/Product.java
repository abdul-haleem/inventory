package com.polaris.inventory.domain;

import java.util.List;

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
	@Column(name = "STOCK_ID")
	private Long stockId;

	@ManyToOne
	@JoinColumn(name = "supplierId", foreignKey = @ForeignKey(name = "fk_PRODUCT_SUPPLIER1"))
	private Supplier supplier;
	
	@ManyToOne
	@JoinColumn(name = "productType", foreignKey = @ForeignKey(name = "fk_PRODUCT_PRODUCT_TYPE"))
	private ProductCategory productCategory;

	@ManyToMany
	@JoinTable(name = "PRODUCT_SPECIFICATION", joinColumns = @JoinColumn(name = "PRODUCT_ID"), inverseJoinColumns = @JoinColumn(name = "PRODUCT_SPECIFICATION_ID"))
	private List<Specification> specifications;

	@OneToOne
	@JoinColumn(name = "stockId")
	private Stock stock;


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

	public Double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(Double unitprice) {
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

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public List<Specification> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(List<Specification> specifications) {
		this.specifications = specifications;
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
}
