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
		
		System.out.println(" ");
		
		System.out.println("New Bank updates");
		System.out.println("----------------");
		
		System.out.println(" ");
		
		System.out.println("Karur Vysya Bank");
		System.out.println("Tamilnadu Mercantile Bank");
		System.out.println("City Union Bank");
		System.out.println("Indian Overseas Bank");
		System.out.println("Bank of Baroda");
		
	}

}
