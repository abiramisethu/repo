package com.billing.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "BillingCustomerDetails" database table.
 * 
 */
@Entity
@Table(name="\"BillingCustomerDetails\"")
@NamedQuery(name="BillingCustomerDetail.findAll", query="SELECT b FROM BillingCustomerDetail b")
public class BillingCustomerDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"BillingCustomerDetailsId\"")
	private Integer billingCustomerDetailsId;

	@Column(name="\"AddressLine1\"")
	private String addressLine1;

	@Column(name="\"AddressLine2\"")
	private String addressLine2;

	@Column(name="\"BillId\"")
	private Long billId;

	@Column(name="\"City\"")
	private String city;

	@Column(name="\"Country\"")
	private String country;

	@Column(name="\"CustomerId\"")
	private Integer customerId;

	@Column(name="\"FirstName\"")
	private String firstName;

	@Column(name="\"LastName\"")
	private String lastName;

	@Column(name="\"PhoneNumber\"")
	private Long phoneNumber;

	@Column(name="\"PostalCode\"")
	private String postalCode;

	@Column(name="\"SchoolName\"")
	private String schoolName;

	@Column(name="\"State\"")
	private String state;

	public BillingCustomerDetail() {
	}

	public Integer getBillingCustomerDetailsId() {
		return this.billingCustomerDetailsId;
	}

	public void setBillingCustomerDetailsId(Integer billingCustomerDetailsId) {
		this.billingCustomerDetailsId = billingCustomerDetailsId;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Long getBillId() {
		return this.billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}