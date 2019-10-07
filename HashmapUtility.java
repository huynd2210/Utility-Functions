    private static <T> void addToHashmap(HashMap<T, Integer> hmap, T element){
        hmap.merge(element, 1, Integer::sum);
    }

    public static HashMap<Integer, Integer> arrayToHashMap(int[] array){
        HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++){
            addToHashmap(hmap,array[i]);
        }
        return hmap;
    }
