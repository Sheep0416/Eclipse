package stringpractice;

import java.math.BigInteger;

public class StringApplication {
	
	//  o1.輸入一段文字,將之全部轉大寫印一次,再全部轉小寫印一次.
	public static void printUpperLower(String s1) {
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
	}

	/*
	 * o3.(巨大整數的算術運算)輸入兩個任意位數的整數字串,求其和與積.
	 * 例如:   12345678 x 87654321 = 99999999
	 *	      11111111 x 11111111 = 12345787654321
	 */
	public static String bigNumberAdd(String s1, String s2) {
		BigInteger b1 = new BigInteger(s1);
		BigInteger b2 = new BigInteger(s2);
		return b1.add(b2).toString();
	}
	
	public static String bigNumberMultiply(String s1, String s2) {
		BigInteger b1 = new BigInteger(s1);
		BigInteger b2 = new BigInteger(s2);
		return b1.multiply(b2).toString();
	}
	
	public static void main(String[] args) {
		
		printUpperLower("iejfiJFIEJFIDMFifIDFIJEFI");
		

	}

}
