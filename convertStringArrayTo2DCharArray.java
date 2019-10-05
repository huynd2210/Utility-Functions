    private static char[][] convertStringArrayToCharGrid(ArrayList<String> stringArray){
        char[][] result = new char[stringArray.size()][stringArray.get(0).length()];
        for (int i = 0; i < stringArray.size(); i++){
            char[] tmp = stringArray.get(i).toCharArray();
            result[i] = tmp;
        }
        return result;
    }
