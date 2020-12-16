package org.jav;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse ");
		
		String original1 = sc.nextLine();
		int length = original1.length();
		
		 for (int i = 5 ; i >= 0; i--) {
			reverse = reverse + original1.charAt(i);
			System.out.println("reverse of entered string:"+reverse);
			
		}
		
	}
	

}




