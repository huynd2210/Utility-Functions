public class VigenereCipher {
	public static String alphabet = "abcdefghijklmnopqrstuvwxyz";//alphabet for key length reference
	public static String encryptVigenere (String plaintext, String key){
		String ciphertext = "";
		String temp = "";
		int count = 0;
		for (int i = 0; i < plaintext.length(); i++){
			char replaceVal = key.charAt(count);
			int shift = alphabet.indexOf(replaceVal);
			String plainchar = Character.toString(plaintext.charAt(i));
			if (shift != -1){
				temp = CaesarCipher.encrypt(plainchar, shift); //encryption 
			}
			ciphertext += temp;
			if (count <= key.length() - 1){
				count++;
			}
			if (count > key.length() - 1){
				count = 0;
			}
		}
		return ciphertext;
	}
	public static String decryptVigenere (String ciphertext, String key){
		String plaintext = "";
		String temp = "";
		int count = 0;
		for (int i = 0; i < ciphertext.length(); i++){
			char replaceVal = key.charAt(count);
			int shift = alphabet.indexOf(replaceVal);
			String plainchar = Character.toString(ciphertext.charAt(i));
			if (shift != -1){
				temp = CaesarCipher.decrypt(plainchar, shift);
			}
			plaintext += temp;
			if (count <= key.length() - 1){
				count++;
			}
			if (count > key.length() - 1){
				count = 0;
			}
		}
		return plaintext;
	}	
	public static void main (String args []){ 
		String ciphertext = encryptVigenere("thehighcommandorderedtheattackontheireasternflankatdawn", "faovsulijc");
		String plaintext = decryptVigenere("gnznagfiloyvktr", "cat");
		System.out.println(ciphertext);	
		System.out.println(plaintext);
	}
}
		
