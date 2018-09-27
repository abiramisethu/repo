package com.billing.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "Customers" database table.
 * 
 */
@Entity
@Table(name="\"Customers\"")
@NamedQuery(name="Customers.findAll", query="SELECT c FROM Customers c")
public class Customers implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(generator="seqGen")
	@SequenceGenerator(name="seqGen",sequenceName="\"Customers_CustomerId_seq\"", allocationSize=1)	
	@Column(name="\"CustomerId\"")
	private Integer customerId;

	@Column(name="\"Active\"")
	private Boolean active;

	@Column(name="\"AddressLine1\"")
	private String addressLine1;

	@Column(name="\"AddressLine2\"")
	private String addressLine2;

	@Column(name="\"City\"")
	private String city;

	@Column(name="\"Country\"")
	private String country;

	@Column(name="\"CustomerName\"")
	private String customerName;

	@Column(name="\"Email\"")
	private String email;

	@Column(name="\"PhoneNumber\"")
	private Long phoneNumber;

	@Column(name="\"PhoneNumber2\"")
	private Long phoneNumber2;

	@Column(name="\"PostalCode\"")
	private String postalCode;

	@Column(name="\"State\"")
	private String state;

	public Customers() {
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getPhoneNumber2() {
		return this.phoneNumber2;
	}

	public void setPhoneNumber2(Long phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}