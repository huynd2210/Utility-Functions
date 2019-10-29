public class SimpleSubstitutionCipher {
	public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";	
	public static StringBuilder keyGen(String string){ //StringShuffler
		StringBuilder sb = new StringBuilder();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < string.length(); i++){
			char c = string.charAt(i);
			list.add(Character.toString(c));
		}
		Collections.shuffle(list);
		for (int j = 0; j < list.size(); j++){
			sb.append(list.get(j));
		}
		return sb;
	}
	public static String encrypt(String plaintext, String mapping){
		String ciphertext = "";
		int length = plaintext.length();
		for (int i = 0; i < length; i++){
			char cipher = plaintext.charAt(i);
			int temp = alphabet.indexOf(cipher);
			char replace = mapping.charAt(temp);
			ciphertext += replace;
		}
		return ciphertext;
	}
	public static String decrypt(String ciphertext, String mapping){
		String plaintext = "";
		int length = ciphertext.length();
		for (int i = 0; i < length; i++){
			char cipher = ciphertext.charAt(i);
			int temp = mapping.indexOf(cipher);
			char replace = alphabet.charAt(temp);
			plaintext += replace;
		}
		return plaintext;
