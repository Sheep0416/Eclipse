package stringpractice;

public class StringsCompare {
	
	public static void compareString(String a, String b) {
		int compare = a.compareTo(b);
		if(compare > 0) {
			System.out.println("C1:" + a + " > " + b);
		} else if(compare < 0){
			System.out.println("C1:" + a + " < " + b);
		} else {
			System.out.println("C1:" + a + " = " + b);
		}
	}
	
	public static void matchString(String a, String b, int start, int len) {
		boolean match = a.regionMatches(true, start, b, start, len);
		if(match == true) {
			System.out.println("C2:equal");
		} else {
			System.out.println("C2:non-equal");
		}
	}
	
	public static void subcompare(String a, String b, int start1, int start2, int len) {
		String suba = a.substring(start1, start1 + len);
		String subb = b.substring(start2, start2 + len);
		int compare = suba.compareTo(subb);
		if(compare > 0) {
			System.out.println("C1:" + suba + " > " + subb);
		} else if(compare < 0){
			System.out.println("C1:" + suba + " < " + subb);
		} else {
			System.out.println("C1:" + suba + " = " + subb);
		}
	}

	public static void main(String[] args) {
		
		String a = "abcdefghijklmnop";
		String b = "abcdefghijklmnopqrst";
		subcompare(a,b,0,0,7);
	}

}
