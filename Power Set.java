   //It is advised to remove duplicates element from arraylist, as arraylist might contains duplicates
   
   public static <T> ArrayList powerSet(ArrayList<T> originalSet){
            ArrayList<ArrayList<T>> powerSet = new ArrayList<>();
            ArrayList<T> tmp = new ArrayList<>();
            int powerSetSize = (int)Math.pow(2, originalSet.size());
            for (int i = 0; i < powerSetSize; i++){
                for (int j = 0; j < originalSet.size(); j++){
                    if ((i & (1 << j)) > 0){
                        tmp.add(originalSet.get(j));
                    }
                }
                powerSet.add(tmp);
                tmp = new ArrayList<>();
            }
            return powerSet;
    }
