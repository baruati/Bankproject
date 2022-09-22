package com.sopra.project;

public class Bank {
	private int bankId;
	private String bankName;
	private int accNumber;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public Bank(int bankId, String bankName, int accNumber) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.accNumber = accNumber;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", accNumber=" + accNumber + "]";
	}
	
}
