    /*2d array reduced to 1d Array
    e.g {{0,1,2},
         {3,4,5}, -> {0,1,2,3,4,5,6,7,8};
         {6,7,8}};
    board[i][j] = board[index] in which index = i * rowSize + j
    e.g board[1][2] (value = 5) = board[5] (index = 1 * 3 + 2 = 5)
    */

import java.util.ArrayList

public class 2DTo1D
public ArrayList<T> array;

public static int rowSize; 
public static int colSize;

public 2DTo1D(T[][] 2dArray){
	this.rowSize = 2dArray[0].length;
	this.colSize = 2dArray.length;
	array = new ArrayList<>();
}

public void init(){
	for (int i = 0; i < rowSize; i++){
		for (int j = 0; j < colSize; j++){
			array.add(2dArray[i][j]);			
		}
	}
}

public T get(int i, int j{ //
	int index = i * rowSize + j;
	return array.get(index);
}

public ArrayList<T> getArray(){
	return this.array;
}
