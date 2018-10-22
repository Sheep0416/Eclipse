package stringpractice;

import java.math.BigInteger;
import java.util.Scanner;

public class StringPractice {
	
	//  s1.���g�@��k,��J�@�r��,�ˬd�Ӧr�굲���O�_�H"bye"�l�r�굲��,�^�ǯu����.
	public static int stringEndWith(String testStr, String end) {
		int endLong = end.length();
		int sLong = testStr.length();
		if(testStr.substring(sLong - endLong, sLong).equals(end)) {
			return 1;
		} else {
			return -1;
		}
	}
	
	//  s2.���g�@��k,��J�@�r��,�ˬd�Ӧr��]�t�X�Ӫťծ�,�^�Ǫťծ�Ӽ�.
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
	
	//  s3.�Q�ΰj��p��r��]�t�p�g�r���Ӽ�.
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
	
	//  s4.�έp�����<return>����,��J�r���Ӽ�(noChars).(��:<return>�䪺ascii�X��13)
	//  Q:scanner ������ 'Space'
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
	
    //  s6.�g�@�{��,�����@�r��,���t�r���j�}�Ʀr,�p���Ʀr�`�M.
	//  �Ҧp:��J�r��"4,6,15,12,8,5",��X�Ʀr�M50
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
	
	//  s7.�g�@��k,�N��J��StringBuilder���󤺩Ҧ��p�ga�ର�j�gA.
	public static StringBuilder builderToUpper(StringBuilder testStr) {
		char[] test = testStr.toString().toCharArray();
		for(int i = 0; i < test.length; i++) {
			if(test[i] >= 97 && test[i] <= 122) {
				test[i] -= 32;
			}
		}
		return new StringBuilder(String.valueOf(test));
	}
	
	//  s9.(��j�p�g)  ��J�@�q��r,�N��������j/�p�g��X.
	public static String[] upperLowerChange(String testStr) {
		String s1 = testStr.toUpperCase();
		String s2 = testStr.toLowerCase();
		return new String[] {s1,s2};
	}
	
	// s10.(ASCII��)���g�ΧQ�Φp�U�����r����k,�C�XASCII�N�X 000~255 ���Ҧ��r��.
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
	
	/*  s12.(���j��ƪ���N�B��)��J��ӥ��N��ƪ����,�D��M�P�n.
	 *  �Ҧp: 12345678 + 87654321 = 99999999
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
