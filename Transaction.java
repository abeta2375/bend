package com.vw.entity;

import java.time.LocalDate;

public class Transaction {

	private int transactionId;
	private int customerCode;
	private int accountNumber;
	private LocalDate transactiondate;
	private String transactionType;
	private String transactionAmount;
	
	public Transaction() {	}

	public Transaction(int transactionId, int customerCode, int accountNumber, LocalDate transactiondate,
			String transactionType, String transactionAmount) {
		super();
		this.transactionId = transactionId;
		this.customerCode = customerCode;
		this.accountNumber = accountNumber;
		this.transactiondate = transactiondate;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public LocalDate getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(LocalDate transactiondate) {
		this.transactiondate = transactiondate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
}
