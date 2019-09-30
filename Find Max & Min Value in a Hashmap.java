	public static int findMaxValueHashMap(HashMap<Character, Integer> map) {
		int max = 0, temp = 0;
		for (Character key : map.keySet()) {
			temp = map.get(key);
			if (max < temp) {
				max = temp;
			}
		}
		return max;
	}
  
  public static int findMinValueHashMap(HashMap<Character, Integer> map) {
		int max = Integer.MAX_VALUE, temp = 0;
		for (Character key : map.keySet()) {
			temp = map.get(key);
			if (max > temp) {
				max = temp;
			}
		}
		return max;
	}
