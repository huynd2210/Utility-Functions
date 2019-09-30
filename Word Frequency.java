import java.util.HashMap;

public class WordFrequency {
	public static HashMap <String, Integer> wordList (String text){
		HashMap <String, Integer> map = new HashMap <String, Integer>();
		String [] words = text.split("\\s*[^a-zA-Z]+\\s*");		 
		String result = "";
		for (int i = 0; i < words.length; i++){
			result = words[i].toLowerCase();
			Integer val = map.get(result);
			if (val != null){
				map.put(result, val + 1);
			}else{
				map.put(result, 1);	
			}
		}
		return map;
		}
	public static void main (String args[]){
		String text = "The protagonist of Hamlet is Prince Hamlet of Denmark, son of the recently deceased King Hamlet, and nephew of King Claudius, his father's brother and successor. Claudius hastily married King Hamlet's widow, Gertrude, Hamlet's mother, and took the throne for himself.";
		HashMap<String, Integer> hmap = wordList(text);
		System.out.println(hmap);
	}
}
