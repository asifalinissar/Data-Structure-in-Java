

// problem : In this problem we sent a code using alphabets , encode this data by incrementing the 
//after that;


public class stringProb {
	
	// method for encode;
	
	public static String encode(String message, int key) {
		
		int newKey = key % 26;
		
		char [] charArray = new char[message.length()];// make a char array of size message.length;
		
		for(int i = 0; i< message.length(); i ++) {
			
			int newLetter = message.charAt(i) + newKey;//charAt(i) : here we get the ASCII code ;
			
			if(newLetter <= 122) {
				charArray[i] = (char) newLetter;//passing corresponding character to char Array;
			}else {
				charArray[i] = (char) (96 + newLetter % 122);
			}
		
	       }
		return new String(charArray);// return charArray; in the form of String;

   }
	
	public static void main(String [] args) {
		
		String message = "hai";
		int key = 2;
		
		stringProb st = new stringProb();
//		st.encode(message, key);
		
		System.out.println(encode(message, key));
	}
	
}
