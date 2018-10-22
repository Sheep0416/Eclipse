package stringpractice;

public class StringTokenizerOrSplit {
	
	//  e1.��J�@�q��r,�Q�ΪŮ��_�r��,�C�X�䤤�H�r�� 'b' �}�Y����r.
	public static void splitStringStart(String s, String split) {
		String[] str = s.split(" ");
		for(String e:str) {
			if(e.substring(0, 1).equals(split)) {
	    		System.out.println(e);
	    	}
		}
	}
	
	//  e2.��J�@�q��r,�Q�ΪŮ��_�r��,�C�X�䤤�H�r�� 'ED' ��������r.
	public static void splitStringEnd(String s, String split) {
		String[] str = s.split(" ");
		int n = split.length();
		for(int i = 0; i < str.length; i++) {
			int m = str[i].length();			
			if(m >= n) {
				if(str[i].substring(m-n, m).equals(split)) {
		    		System.out.println(str[i]);
		    	}
			}		
		}
	}
	
	/*  e4.(�y�l����)
	 *	 ��J�@���r,�Q�ΪŮ��_�r,�϶��ǦL�X�_�r���G.
	 *	 �Ҧp:	
	 * 	 ��J: How are you,	��X:  you are How
	 * 	 ��J: �A �R ��,		��X:  �� �R �A
     *
	 *	C/C++: �� strtok ���;
	 *	Java: �� StringTokenizer ����Φr�� split ��k,�n��ξA���_�r�r��.
     */
	public static void reversePrint(String s) {
		String[] str = s.split(" ");
		for(int i = str.length-1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		String cnn = "Iconic Watergate investigative reporters Carl Bernstein and Bob Woodward are talking now with CNN Special Correspondent Jamie Gangel today.\r\n" + 
				"\r\n" + 
				"Bernstein and Woodward were both Washington Post reporters who helped uncover the 1970s Watergate scandal that brought down President Richard Nixon.\r\n" + 
				"\r\n" + 
				"Woodward recently drew the ire of President Trump over his bombshell book, \"Fear: Trump in the White House,\" which provides an unprecedented inside-the-room look through the eyes of the President's inner circle.\r\n" + 
				"\r\n" + 
				"From the Oval Office to the Situation Room to the White House residence, Woodward used confidential background interviews to illustrate how some of the President's top advisers view him as a danger to national security and have sought to circumvent the commander in chief.\r\n" + 
				"\r\n" + 
				"Bernstein, a CNN political analyst, defended Woodward's book and vouched for his former colleague's methodology of reporting of drawing from hundreds of hours of interviews with first-hand sources and documents to back up quotes, saying it was the same method the pair used while reporting on the Nixon administration.\r\n" + 
				"\r\n" + 
				"Trump and the White House have pushed back on the allegations in Woodward's book, but Woodward stands by his reporting.";
	    
		splitStringStart(cnn, "b");
	    splitStringEnd(cnn, "ed");
	    
	    String a = "How are you";
	    reversePrint(a);
	    
	}
}
