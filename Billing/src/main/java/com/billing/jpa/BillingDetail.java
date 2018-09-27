package com.billing.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "BillingDetails" database table.
 * 
 */
@Entity
@Table(name="\"BillingDetails\"")
@NamedQuery(name="BillingDetail.findAll", query="SELECT b FROM BillingDetail b")
public class BillingDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"BillingDetailsId\"")
	private Integer billingDetailsId;

	@Column(name="\"BillAmount\"")
	private BigDecimal billAmount;

	@Column(name="\"BillId\"")
	private Long billId;

	@Column(name="\"CreatedDate\"")
	private Timestamp createdDate;

	@Column(name="\"DiscountAmount\"")
	private BigDecimal discountAmount;

	@Column(name="\"ProductId\"")
	private Long productId;

	@Column(name="\"Quantity\"")
	private Integer quantity;

	@Column(name="\"TotalAmount\"")
	private BigDecimal totalAmount;

	@Column(name="\"UpdatedDate\"")
	private Timestamp updatedDate;

	public BillingDetail() {
	}

	public Integer getBillingDetailsId() {
		return this.billingDetailsId;
	}

	public void setBillingDetailsId(Integer billingDetailsId) {
		this.billingDetailsId = billingDetailsId;
	}

	public BigDecimal getBillAmount() {
		return this.billAmount;
	}

	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}

	public Long getBillId() {
		return this.billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public BigDecimal getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Timestamp getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

}