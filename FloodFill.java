//Require implementation of checkValid() method
public static void floodFill(char[][] map, int vertical, int horizontal, char old, char replace){
        if (checkValid(vertical, horizontal, map.length, map[0].length)){
            if (map[vertical][horizontal] == old){
                map[vertical][horizontal] = replace;
                floodFill(map, vertical, horizontal + 1, old, replace);
                floodFill(map, vertical - 1, horizontal, old, replace);
                floodFill(map, vertical, horizontal - 1, old, replace);
                floodFill(map, vertical + 1, horizontal, old, replace);
            } else if (map[vertical][horizontal] == replace || map[vertical][horizontal] != old){
                return;
            }
        }
    }
