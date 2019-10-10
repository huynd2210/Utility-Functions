    private static <K> void addToHashmap(HashMap<K, Integer> hmap, K keyElement){
        hmap.merge(keyElement, 1, Integer::sum);
    }

    public static HashMap<Integer, Integer> arrayToHashMap(int[] array){
        HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++){
            addToHashmap(hmap,array[i]);
        }
        return hmap;
    }

    private static <K> int sumHashmapValues(HashMap<K, Integer> map){
        int sum = 0;
        for (Map.Entry<K, Integer> entry : map.entrySet()){
            sum += (entry.getValue() / 2);
        }
        return sum;
    }
