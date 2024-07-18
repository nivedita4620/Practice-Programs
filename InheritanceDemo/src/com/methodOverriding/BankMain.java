package com.methodOverriding;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rate1 = new SBI();
		double intRate = rate1.interstRate();
		System.out.println(intRate);
		
		RBI rate2 = new ICICI();
		double intRate2 = rate2.interstRate();
		System.out.println(intRate2);
		
		RBI rate3 = new Axis();
		double intRate3 = rate3.interstRate();
		System.out.println(intRate3);
	}

}
