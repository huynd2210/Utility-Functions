public class CaesarCipher {
	public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";	
	public static String encrypt (String plaintext, int shift){
		String ciphertext = "";
		int length = plaintext.length();
		for (int i = 0; i < length; i++){
			char cipher = (char) (plaintext.charAt(i) + shift);
			if (cipher > 'z'){
				ciphertext += (char)(plaintext.charAt(i) - (26 - shift));
			}else {
				ciphertext += (char)(plaintext.charAt(i) + shift);
			}
		}
		return ciphertext;
	}
	public static String decrypt (String ciphertext, int shift){
		String plaintext = "";
		for (int i = 0; i < ciphertext.length(); i++){
			char replaceVal = ciphertext.charAt(i);
			int charPosition = alphabet.indexOf(replaceVal);
			if (charPosition != -1){
				int keyVal = (charPosition - shift) % 26;
				if (keyVal < 0){
					keyVal = alphabet.length() + keyVal;
				}
				replaceVal = alphabet.charAt(keyVal);
			}
			plaintext += replaceVal;
		}
		return plaintext;
	}	
	public static void main (String args []){
		String a =  decrypt("b",1);
		System.out.println(a);
	}
}
