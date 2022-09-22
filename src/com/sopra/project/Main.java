package com.sopra.project;

public class Main{

	
	public static long deposit(long amt, long balance ) {
		balance= balance +amt;
		return balance;
		
	}
	public static long  withdraw (long amt,long balance ) {
		balance = balance-amt;
		return balance;
		
	}
	void display() {
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long balance=5000;
		long  amt=1234;
		long amt1=2000;
		Bank c1= new Bank(91000,"hdfc",234567);
		System.out.println(amt+ " has been debited from your acc num " + c1.getAccNumber()+" remaining balance is "+withdraw(amt,balance));
		System.out.println(amt1+ " has been credited to your acc num " + c1.getAccNumber()+" remaining balance is "+deposit(amt1,balance));
		

	}

}
