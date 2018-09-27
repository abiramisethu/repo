package com.billing.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "ProductPrice" database table.
 * 
 */
@Embeddable
public class ProductPricePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"ProductId\"", insertable=false, updatable=false)
	private Long productId;

	@Column(name="\"CustomerId\"", insertable=false, updatable=false)
	private Long customerId;

	public ProductPricePK() {
	}
	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProductPricePK)) {
			return false;
		}
		ProductPricePK castOther = (ProductPricePK)other;
		return 
			this.productId.equals(castOther.productId)
			&& this.customerId.equals(castOther.customerId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.productId.hashCode();
		hash = hash * prime + this.customerId.hashCode();
		
		return hash;
	}
}