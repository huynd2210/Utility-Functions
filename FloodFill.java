//Require implementation of checkValid() method
    public static void floodFill(char[][] board, int verticalCoordinate, int horizontalCoordinate, char old, char replace){
        if (verticalCoordinate < 0 || verticalCoordinate >= board.length || horizontalCoordinate < 0 || horizontalCoordinate >= board[0].length){
            return;
        }
        if (board[verticalCoordinate][horizontalCoordinate] != old){
            return;
        }
        board[verticalCoordinate][horizontalCoordinate] = replace;
        floodFill(board, verticalCoordinate, horizontalCoordinate + 1, old, replace);
        floodFill(board, verticalCoordinate - 1, horizontalCoordinate, old, replace);
        floodFill(board, verticalCoordinate, horizontalCoordinate - 1, old, replace);
        floodFill(board, verticalCoordinate + 1, horizontalCoordinate, old, replace);
    }
