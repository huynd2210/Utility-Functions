import java.util.Arrays;

public class HarmoniusSequence {
		public static void main (String args []){
			int arr[] = {1,2,3,3,4,4,4,5,5,5,6,7,8,8,9,11,10,12};
			Arrays.sort(arr);
			int length = arr.length;
			int count = 0, currPos = 0, finalcount = 0;		
			for (int i = 1; i < length; i++ ){
				if (arr[i] - arr[currPos] == 1 || arr[i] - arr[currPos] == 0){
					count += 1;
				}else{
					currPos += 1;
					i = currPos;
					if (count >= finalcount){
						finalcount = count;
						count = 0;
					}else{
						count = 0;
					}
				}
			}
			System.out.println(finalcount + 1);
			
		//solution: sort the array (provided that the order isn't important) then subtract the first number from the s
		//second number. If result = 1, then add to a new ArrayList (or add count if goal was to count occurences)
		//if order is important 	
		}
}
