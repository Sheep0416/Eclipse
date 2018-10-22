package stringpractice;

import java.math.BigInteger;
import java.util.Scanner;

public class StringPractice {
	
	//  s1.撰寫一方法,輸入一字串,檢查該字串結尾是否以"bye"子字串結束,回傳真假值.
	public static int stringEndWith(String testStr, String end) {
		int endLong = end.length();
		int sLong = testStr.length();
		if(testStr.substring(sLong - endLong, sLong).equals(end)) {
			return 1;
		} else {
			return -1;
		}
	}
	
	//  s2.撰寫一方法,輸入一字串,檢查該字串包含幾個空白格,回傳空白格個數.
	public static int spaceNum(String testStr) {
		int space = 0;
		char[] test = testStr.toCharArray();
		for(char e:test) {
			if(e == ' ') {
				space++;
			}
		}
		return space;
	}
	
	//  s3.利用迴圈計算字串包含小寫字元個數.
	public static int lowerCaseCount(String testStr) {
		int lower = 0;
		char[] test = testStr.toCharArray();
		for(char e:test) {
			if(e >= 97 && e <= 122) {
				lower++;
			}
		}
		return lower;
	}
	
	//  s4.統計直到按<return>為止,輸入字元個數(noChars).(註:<return>鍵的ascii碼為13)
	//  Q:scanner 不接受 'Space'
	public static int charCount() {
		Scanner scanner = new Scanner(System.in);
		String testStr = scanner.next();
		char[] test = testStr.toCharArray();
		int count = 0;
		for(char e:test) {
			if(e >= 32 && e <= 126) {
				count++;
			}
		}
		scanner.close();
		return count;
	}
	
    //  s6.寫一程式,接收一字串,內含逗號隔開數字,計算其數字總和.
	//  例如:輸入字串"4,6,15,12,8,5",輸出數字和50
	public static int calculateSum(String testStr) {
		char[] test = testStr.toCharArray();
		int sum = 0;
		int start = 0;
		for(int i = 0; i < test.length; i++) {
			if(test[i] == ',') {
				sum += Integer.parseInt(testStr.substring(start,i));
				start = i+1;
			}
			if(i == test.length-1) {
				sum += Integer.parseInt(testStr.substring(start,i+1));
			}
		}
		return sum;
	}
	
	//  s7.寫一方法,將輸入的StringBuilder物件內所有小寫a轉為大寫A.
	public static StringBuilder builderToUpper(StringBuilder testStr) {
		char[] test = testStr.toString().toCharArray();
		for(int i = 0; i < test.length; i++) {
			if(test[i] >= 97 && test[i] <= 122) {
				test[i] -= 32;
			}
		}
		return new StringBuilder(String.valueOf(test));
	}
	
	//  s9.(轉大小寫)  輸入一段文字,將之全部轉大/小寫輸出.
	public static String[] upperLowerChange(String testStr) {
		String s1 = testStr.toUpperCase();
		String s2 = testStr.toLowerCase();
		return new String[] {s1,s2};
	}
	
	// s10.(ASCII表)撰寫及利用如下整數轉字元方法,列出ASCII代碼 000~255 的所有字元.
	// char intToChar(int ascii_code)
	public static void printAscii() {
		int a = 0;
		int sum = 0;
		while(a <= 255) {
			System.out.printf("%c  ",(char)a);
			a++;
			sum++;
			if(sum > 10) {
				sum = 0;
				System.out.println("");
			}
		}
	}
	
	/*  s12.(巨大整數的算術運算)輸入兩個任意位數的整數,求其和與積.
	 *  例如: 12345678 + 87654321 = 99999999
	 * 	     11111111 x 11111111 = 12345787654321
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
		
		String s1 = "12345678";
		String s2 = "87654321";
		String s3 = "11111111";
		
		System.out.println(bigNumberMultiply(s3,s3));
		
		

	}

}
