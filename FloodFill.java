import java.util.Deque;
import java.util.LinkedList;

public class FloodFiller {
    private FloodFiller() {}

    public static void floodFillRecursive(char[][] board, int verticalCoordinate, int horizontalCoordinate, char old, char replace){
        if (verticalCoordinate < 0 || verticalCoordinate >= board.length || horizontalCoordinate < 0 || horizontalCoordinate >= board[0].length){
            return;
        }
        if (board[verticalCoordinate][horizontalCoordinate] != old){
            return;
        }
        board[verticalCoordinate][horizontalCoordinate] = replace;
        floodFillRecursive(board, verticalCoordinate, horizontalCoordinate + 1, old, replace);
        floodFillRecursive(board, verticalCoordinate - 1, horizontalCoordinate, old, replace);
        floodFillRecursive(board, verticalCoordinate, horizontalCoordinate - 1, old, replace);
        floodFillRecursive(board, verticalCoordinate + 1, horizontalCoordinate, old, replace);
    }
    
    public static void floodFillQueue(char[][] board, int verticalCoordinate, int horizontalCoordinate, char old, char replace) {
        Deque<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(verticalCoordinate, horizontalCoordinate));
        while (!queue.isEmpty()) {
            Coordinate coordinate = queue.pop();
            board[coordinate.getI()][coordinate.getJ()] = replace;
            enqueueAdjacentPoint(board, queue, coordinate.getI(), coordinate.getJ(), old);
        }

    }

    private static void enqueueAdjacentPoint(char[][] board, Deque<Coordinate> currentQueue, int verticalCoordinate, int horizontalCoordinate, char old) {
        if (isPointValid(new Coordinate(verticalCoordinate, horizontalCoordinate + 1), board, old)) {
            currentQueue.add(new Coordinate(verticalCoordinate, horizontalCoordinate + 1));
        }
        if (isPointValid(new Coordinate(verticalCoordinate - 1, horizontalCoordinate), board, old)) {
            currentQueue.add(new Coordinate(verticalCoordinate - 1, horizontalCoordinate));
        }
        if (isPointValid(new Coordinate(verticalCoordinate, horizontalCoordinate - 1), board, old)) {
            currentQueue.add(new Coordinate(verticalCoordinate, horizontalCoordinate - 1));
        }
        if (isPointValid(new Coordinate(verticalCoordinate + 1, horizontalCoordinate), board, old)) {
            currentQueue.add(new Coordinate(verticalCoordinate + 1, horizontalCoordinate));
        }
    }

    private static boolean isInBound(Coordinate p, char[][] board) {
        return !(p.getI() < 0 || p.getI() >= board.length || p.getJ() < 0 || p.getJ() >= board[0].length);
    }

    private static boolean isPointValid(Coordinate p, char[][] board, char old) {
        if (isInBound(p, board)){
            return (board[p.getI()][p.getJ()] == old);
        }else{
            return false;
        }

    }

}

class Coordinate {
    private int i;
    private int j;

    public Coordinate(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
