package com.billing.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "BillingMaster" database table.
 * 
 */
@Entity
@Table(name="\"BillingMaster\"")
@NamedQuery(name="BillingMaster.findAll", query="SELECT b FROM BillingMaster b")
public class BillingMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"BillId\"")
	private Integer billId;

	@Column(name="\"BillAmount\"")
	private BigDecimal billAmount;

	@Column(name="\"BillDate\"")
	private Timestamp billDate;

	@Column(name="\"BillingTypeId\"")
	private Long billingTypeId;

	@Column(name="\"CreatedDate\"")
	private Timestamp createdDate;

	@Column(name="\"DiscountAmount\"")
	private BigDecimal discountAmount;

	@Column(name="\"TotalAmount\"")
	private BigDecimal totalAmount;

	@Column(name="\"UpdatedDate\"")
	private Timestamp updatedDate;

	public BillingMaster() {
	}

	public Integer getBillId() {
		return this.billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public BigDecimal getBillAmount() {
		return this.billAmount;
	}

	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}

	public Timestamp getBillDate() {
		return this.billDate;
	}

	public void setBillDate(Timestamp billDate) {
		this.billDate = billDate;
	}

	public Long getBillingTypeId() {
		return this.billingTypeId;
	}

	public void setBillingTypeId(Long billingTypeId) {
		this.billingTypeId = billingTypeId;
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