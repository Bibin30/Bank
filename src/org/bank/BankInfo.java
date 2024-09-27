package org.bank;

public class BankInfo extends AxisBank {
	private void savings() {
		// TODO Auto-generated method stub
		System.out.println("Bank Savings");
	}
	private void fixed() {
		// TODO Auto-generated method stub
		System.out.println("Bank Fixed");
	}
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.savings();
		b.fixed();
		b.deposit();
	}

}
