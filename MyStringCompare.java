
/*
 * 	c4.(自製字串比較方法)
 *  請參照 Java 字串類別,限定只能利用字串的.charAt及.length兩方法,
 * 	自製如下字串比較方法,
 *
 *   myEquals(src1,src2)— 比較兩字串是否相等。
 *   myEqualsIgnore(src1,src2)— 比較兩字串不分大小寫是否相等
 *   myCompareTo(src1,src2)— 比較兩字串、大於、等於、或小於
 *   myRegionMatches(src1,src1Offset,src2,src2Offset,len)
 *   - 比較兩字串，A 字串 從 src1Offset 與 B 字串 從src2Offset 長度 len 內所包含的字串是否相等
 *   - 例如 abcedfg , bcdefg  - src1 = abcedfg, src2 = bcdefg, len = 3
 *   - src1Offset = 2 , src1 = ced
 *   - src2Offset = 2 , src2 = def  —> fale
 *   myStartsWith(src1,startsWithSrc2) — 
 *   myStartsWith(src1,startsWithSrc2,src1Offset)— 
 *   myEndsWith(src1,endsWithSrc2)
 */
package stringpractice;

public class MyStringCompare {
	
	public static boolean myEquals(String src1, String src2) {
		char[] ch1 = src1.toCharArray();
		char[] ch2 = src2.toCharArray();
		int a = src1.length();
		if(a != src2.length()) {
			return false;
		}
		while(a-- > 0) {
			if(ch1[a] != ch2[a]) {
				return false;
			}
		}
		return true;	
	}
	
	public static boolean myEqualsIgnore(String src1, String src2) {
		char[] ch1 = src1.toCharArray();
		char[] ch2 = src2.toCharArray();
		int a = src1.length();
		if(a != src2.length()) {
			return false;
		}
		while(a-- > 0) {
			if(ch1[a] == ch2[a]) {
				continue;
			}
			// TODO - lower upper?
			if(Character.toLowerCase(ch1[a]) == Character.toLowerCase(ch2[a])) {
				continue;
			}
			if(Character.toUpperCase(ch1[a]) == Character.toUpperCase(ch2[a])) {
				continue;
			}
		}
		return true;
	}
	
	// String.compare return a[i] - b[i] or len[a] - len[b]
	public static int myCompare(String src1, String src2) {
		char[] a = src1.toCharArray();
		char[] b = src2.toCharArray();
		int cha = 0;
		int chb = 0;
		for(int i = 0; i < a.length; i++) {
			cha += a[i];
		}
		for(int i = 0; i < b.length; i++) {
			chb += b[i];
		}
		return cha - chb;
	}
	
	public static boolean myStartsWith(String src1, String src2) {
		return src1.substring(0) == src2.substring(0); 
	}
	
	public static boolean myStartsWith(String src1, String src2, int srcOffest) {
		return src1.substring(srcOffest).equals(src2); 
	}
	
	public static void main(String[] args) {
		// test code
		int a = 'a';
		String c = "ca";
		String b = "cca";
		System.out.println(a);
		System.out.println(myStartsWith(b,c,1));
	}

}
