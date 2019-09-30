//Given two strings s and t, determine if they are isomorphic.
//Two strings are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while preserving the order of characters.
//No two characters may map to the same character but a character may map to itself.
// E.g "egg" and "add" are isomorphic


import java.util.HashMap;

public class IsomorphicChecker {
	public static boolean isIsomorphic (String a, String b){
		if (a.length()!=b.length()){
			return false;
		}
		if (a==null||b==null){
			return false;
		}
		HashMap<Character, Character> isoMap = new HashMap<Character, Character>();
			for (int i = 0;i < a.length(); i++){
			char a1 = a.charAt(i);
			char b1 = b.charAt(i);		
			if (isoMap.containsKey(a1)){
				if(isoMap.get(a1)!=b1){
					return false;
				}
			}
			isoMap.put(a1,b1);
		}
		return true;
	}
	public static void main (String args []){
		boolean a = isIsomorphic("abas","eaae");
		System.out.println(a);
	}
}
