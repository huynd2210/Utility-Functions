public class AtbashCipher {
	
	public static void main (String args []){
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String plaintext = "zzz";
		plaintext = plaintext.replaceAll(" ", "");
		plaintext = plaintext.toLowerCase();
		int length = plaintext.length();
		String ciphertext = "";
		for (int i = 0; i < length; i++){
			char b = plaintext.charAt(i);
			for (int j = 0; j < alphabet.length(); j++){
				char c = alphabet.charAt(j);
				if (c==b){
					int index = alphabet.indexOf(c);
					int position = (alphabet.length() - 1) - index;
					ciphertext += alphabet.charAt(position);
					break;
				}
			}
		}
		System.out.println(ciphertext);
	}
}
