package com.vw.entity;

public class Customer {

	private int customerCode;
	private String customerName;
	private String address;
	private String mobile;
	
	public Customer() {	}
	
	public Customer(int customerCode, String customerName, String address, String mobile) {
		super();
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.address = address;
		this.mobile = mobile;
	}

	public int getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
