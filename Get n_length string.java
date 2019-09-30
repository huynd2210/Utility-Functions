//return all words with length n. Words must be separated with space
	public static void get_nString (String string, int length){
		String [] words = string.split(" ");
		String result = "";
		String parsed = "";
		for (int i = 0; i < words.length; i++){
			parsed = words[i];
			if (parsed.length() == length){
				result = parsed;
				System.out.println(result);
			}	
		}
	}
	public static void main (String args []){
		get_nString ("hello my name is bobe", 4);
	}
