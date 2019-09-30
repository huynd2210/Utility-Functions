import java.util.HashMap;

public class Ngrams {
	public static HashMap<String, Integer> getBigram (String string){
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		string = string.toUpperCase();
		String [] words = string.split("\\s");
		for (int j = 0; j < words.length; j++){
			String parsedString = words[j];
			for (int i = 0; i < parsedString.length() - 1; i++){
				sb.append(parsedString.charAt(i));
				sb.append(parsedString.charAt(i+1));
				Integer val = map.get(sb);
				if (val != null){
				map.put(sb.toString(), val + 1);
				}else{
					map.put(sb.toString(), 1);
				}
				sb.delete(0, sb.length());
			}
		}
		return map;
	}
	public static HashMap<String, Integer> getTrigram (String string){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		string = string.toUpperCase();
		String [] words = string.split("\\s");
		for (int j = 0; j < words.length; j++){
			String parsedString = words[j];
			for (int i = 0; i < parsedString.length() - 2; i++){
				sb.append(parsedString.charAt(i));
				sb.append(parsedString.charAt(i+1));
				sb.append(parsedString.charAt(i+2));
				Integer val = map.get(sb);
				if (val != null){
					map.put(sb.toString(), val + 1);
				}else{
					map.put(sb.toString(), 1);
				}
				sb.delete(0, sb.length());
			}
		}
		return map;
	}
	public static HashMap<String, Integer> getQuadgram (String string){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		string = string.toUpperCase();
		String [] words = string.split("\\s");
		for (int j = 0; j < words.length; j++){
			String parsedString = words[j];
			for (int i = 0; i < parsedString.length() - 3; i++){
				sb.append(parsedString.charAt(i));
				sb.append(parsedString.charAt(i+1));
				sb.append(parsedString.charAt(i+2));
				sb.append(parsedString.charAt(i+3));
				Integer val = map.get(sb);
				if (val != null){
					map.put(sb.toString(), val + 1);
				}else{
					map.put(sb.toString(), 1);
				}
				sb.delete(0, sb.length());
			}
		}
		return map;
	}
}
