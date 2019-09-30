public static String StringShuffle(String string){
		String result = "";
		int length = string.length();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < length; i++){
			char c = string.charAt(i);
			list.add(Character.toString(c));
		}
		Collections.shuffle(list);
		for (int j = 0; j < list.size(); j++){
			result = result + list.get(j);
		}
		return result;
	}
