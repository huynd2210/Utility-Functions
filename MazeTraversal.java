import java.util.ArrayList;
import java.util.Arrays;

//Given a 2d matrix/grid, a target to find, and wall (if any) it will return all the coordinate (index based) of the target(s)

public class DFTraversal {
    private char DEFAULT_TARGET_CHAR = '.';
    private char DEFAULT_EMPTY_SPACE = ' ';
    private char DEFAULT_WALL_CHAR = '#';
    private char targetChar;
    private char emptySpace;
    private char wallChar;
    private char[][] grid;

    private ArrayList<int[]> resultCoordinateList = new ArrayList<>();


    public DFTraversal(char[][] grid) {
        this.grid = grid;
        this.targetChar = DEFAULT_TARGET_CHAR;
        this.emptySpace = DEFAULT_EMPTY_SPACE;
        this.wallChar = DEFAULT_WALL_CHAR;
    }

    public DFTraversal(char[][] grid, char targetChar, char emptySpace, char wallChar) {
        this.grid = grid;
        this.targetChar = targetChar;
        this.emptySpace = emptySpace;
        this.wallChar = wallChar;
    }

    public void traverse(int vertical, int horizontal){
        int[] temp = new int[2];
        if (grid[vertical][horizontal] == this.targetChar){ //Found targetGoal, return coordinate (index Coordinate)
            int[] resultCoordinate = new int[2];  //Contain Coordinate of result/target (Array coordinate i,j)
            resultCoordinate[0] = vertical;
            resultCoordinate[1] = horizontal;
            resultCoordinateList.add(resultCoordinate);
         //   printArray(resultCoordinate);
        }
        if (grid[vertical][horizontal] == emptySpace){
            grid[vertical][horizontal] = 'x'; //Mark already explored space
            traverse(vertical, horizontal + 1);
            traverse(vertical - 1, horizontal);
            traverse(vertical, horizontal - 1);
            traverse(vertical + 1, horizontal);
        }else if (grid[vertical][horizontal] == wallChar || grid[vertical][horizontal] == 'x'){
            return;
        }
    }

    public void printResultCoordinateList(){
        for (int i = 0; i < resultCoordinateList.size(); i++){
            System.out.println(Arrays.toString(resultCoordinateList.get(i)));
        }
    }

    public ArrayList<int[]> getResultCoordinateList(){
        return this.resultCoordinateList;
    }

}
