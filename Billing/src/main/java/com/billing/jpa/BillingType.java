package com.billing.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "BillingType" database table.
 * 
 */
@Entity
@Table(name="\"BillingType\"")
@NamedQuery(name="BillingType.findAll", query="SELECT b FROM BillingType b")
public class BillingType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"BillingTypeId\"")
	private Integer billingTypeId;

	@Column(name="\"BillTypeName\"")
	private String billTypeName;

	public BillingType() {
	}

	public Integer getBillingTypeId() {
		return this.billingTypeId;
	}

	public void setBillingTypeId(Integer billingTypeId) {
		this.billingTypeId = billingTypeId;
	}

	public String getBillTypeName() {
		return this.billTypeName;
	}

	public void setBillTypeName(String billTypeName) {
		this.billTypeName = billTypeName;
	}

}