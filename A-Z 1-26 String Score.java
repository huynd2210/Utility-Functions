//Calculate score for a string as following:  //String score = sum of characters in string (a = 1, b = 2...) i.e A - Z = 1 - 26
//If 2 strings has the same score, then they are anagrams
//Note: To use HashMap Method, the hashmap must be initialized. HashMap Method is faster, if map initialization time is not included


private static String alphabet = "abcdefghijklmnopqrstuvwxyz";

public static int calculateStringScore(String string){ //String score = sum of characters in string (a = 1, b = 2...)
        int score = 0;
        for (int i = 0; i < string.length(); i++){
            score += alphabet.indexOf(string.charAt(i)) + 1;
        }
        return score;
    }

OR
    public static HashMap<Character, Integer> charMap = new HashMap<>();
    public static void charMapInit(){
        charMap.put('a', 1); charMap.put('b', 2); charMap.put('c',3); charMap.put('d',4); charMap.put('e',5);
        charMap.put('f', 6); charMap.put('g', 7); charMap.put('h', 8); charMap.put('i', 9); charMap.put('j', 10);
        charMap.put('k', 11); charMap.put('l', 12); charMap.put('m', 13); charMap.put('n', 14); charMap.put('o', 15);
        charMap.put('p', 16); charMap.put('q', 17); charMap.put('r', 18); charMap.put('s', 19); charMap.put('t', 20);
        charMap.put('u', 21); charMap.put('v', 22); charMap.put('w', 23); charMap.put('x', 24); charMap.put('y', 25);
        charMap.put('z', 26);
    }

    public static int calculateStringScore(String string){
        int score = 0;
        int length = string.length();
        for (int i = 0; i < length; i++){
            score += charMap.get(string.charAt(i));
        }
        return score;
    }
