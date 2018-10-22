package stringpractice;

import java.math.BigInteger;

public class StringApplication {
	
	//  o1.��J�@�q��r,�N��������j�g�L�@��,�A������p�g�L�@��.
	public static void printUpperLower(String s1) {
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
	}

	/*
	 * o3.(���j��ƪ���N�B��)��J��ӥ��N��ƪ���Ʀr��,�D��M�P�n.
	 * �Ҧp:   12345678 x 87654321 = 99999999
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
