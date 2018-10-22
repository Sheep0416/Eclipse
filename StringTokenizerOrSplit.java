package stringpractice;

public class StringTokenizerOrSplit {
	
	//  e1.輸入一段文字,利用空格斷字後,列出其中以字母 'b' 開頭的單字.
	public static void splitStringStart(String s, String split) {
		String[] str = s.split(" ");
		for(String e:str) {
			if(e.substring(0, 1).equals(split)) {
	    		System.out.println(e);
	    	}
		}
	}
	
	//  e2.輸入一段文字,利用空格斷字後,列出其中以字串 'ED' 結尾的單字.
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
	
	/*  e4.(句子反轉)
	 *	 輸入一行文字,利用空格斷字,反順序印出斷字結果.
	 *	 例如:	
	 * 	 輸入: How are you,	輸出:  you are How
	 * 	 輸入: 你 愛 我,		輸出:  我 愛 你
     *
	 *	C/C++: 用 strtok 函數;
	 *	Java: 用 StringTokenizer 物件或字串 split 方法,要選用適當斷字字元.
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
