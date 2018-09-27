package com.billing.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "ProductPrice" database table.
 * 
 */
@Entity
@Table(name="\"ProductPrice\"")
@NamedQuery(name="ProductPrice.findAll", query="SELECT p FROM ProductPrice p")
public class ProductPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProductPricePK id;

	@Column(name="\"Active\"")
	private Boolean active;

	@Column(name="\"CreatedDate\"")
	private Timestamp createdDate;

	@Column(name="\"Price\"")
	private BigDecimal price;

	@Column(name="\"ProductPriceId\"")
	private Integer productPriceId;

	@Column(name="\"TaxPercent\"")
	private BigDecimal taxPercent;

	@Column(name="\"UpdatedDate\"")
	private Timestamp updatedDate;


	public ProductPrice() {
	}

	public ProductPricePK getId() {
		return this.id;
	}

	public void setId(ProductPricePK id) {
		this.id = id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getProductPriceId() {
		return this.productPriceId;
	}

	public void setProductPriceId(Integer productPriceId) {
		this.productPriceId = productPriceId;
	}

	public BigDecimal getTaxPercent() {
		return this.taxPercent;
	}

	public void setTaxPercent(BigDecimal taxPercent) {
		this.taxPercent = taxPercent;
	}

	public Timestamp getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}


}