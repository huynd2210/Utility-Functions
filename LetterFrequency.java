public class LetterFrequency {
	public static HashMap<Character, Integer> letterfreq(String string){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++){
			char chars = string.charAt(i);
			Integer val = map.get(new Character(chars));
			if (val != null){
				map.put(chars, new Integer(val + 1));
			}else{
				map.put(chars, 1);
			}
		}
		return map;
	}
	public static void main (String args[]){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map = letterfreq("afkdddddvnssafsafdsfsfbbdfdfbdknsadfsaa");
		System.out.println(map);
	}
