package com.corejava.programs;
import java .util.Scanner;
public class ascii_value {

	public static void main(String[] args) {
		
		System.out.println("Enter a Character:");
		Scanner sc = new Scanner (System.in);
		char ch = sc.next().charAt(0);
		int asc = ch;
		System.out.println("ASCII Value is:"+asc);
	}

}
