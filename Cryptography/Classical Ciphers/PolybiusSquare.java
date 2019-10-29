public class PolybiusSquare {
	public static String encrypt (String plaintext){
		StringBuilder sb = new StringBuilder();
		String result = "";
		plaintext = plaintext.toUpperCase();
		char square[][] = {
				{'A','B','C','D','E'},
				{'F','G','H','I','K'},
	            {'L','M','N','O','P'}, 
	            {'Q','R','S','T','U'},
	            {'V','W','X','Y','Z'}
	            };
		char temp;
		for (int i = 0; i < plaintext.length(); i++){
			temp = plaintext.charAt(i);
			for (int j = 0; j < 5; j++){
				for (int k = 0; k < 5; k++){
					if (temp == square[j][k]){
						int a = j + 1;
						int b = k + 1;
						sb.append(a);
						sb.append(b);
					}
				}
			}
		}
		result = sb.toString();
		return result;
	}
	public static String decrypt (String ciphertext){
		if (ciphertext.length() % 2 != 0){
			return ciphertext;
		}else{
		char temp;
		StringBuilder sb = new StringBuilder();
		char square[][] = {
				{'a','b','c','d','e'},
				{'f','g','h','i','k'},
	            {'l','m','n','o','p'}, 
	            {'q','r','s','t','u'},
	            {'v','w','x','y','z'}
	            };
		for (int i = 1; i < ciphertext.length(); i+= 2){
			int a = Character.getNumericValue(ciphertext.charAt(i - 1));
			int b = Character.getNumericValue(ciphertext.charAt(i));
			temp = square[a - 1][b - 1];
			sb.append(temp);
		}
		
		return sb.toString();
		}
	}
	public static void main (String args []){
		String ciphertext = "521523115115421513152451151434421415422142343244231523242223133432321133144434311145331323113311444411132534334423154224222344213111332534214423151533153254114414115233";
		String poly = encrypt("upu");
		//String poly = encrypt("We have received order from the high command to launch an attack on the right flank of the enemy at dawn");
		System.out.println(poly);
		String text = decrypt(ciphertext);
		System.out.println(text);
//		for (int i = 1; i < ciphertext.length(); i+= 2){
//		int a = Character.getNumericValue(ciphertext.charAt(i));
//		int b = Character.getNumericValue(ciphertext.charAt(i - 1));
//		System.out.print(b);
//		System.out.print(a);
//		}
	}
}
