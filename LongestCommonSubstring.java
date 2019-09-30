public static String LCS(char [] A, char [] B){ //Longest Common Substring
		int matrix [][] = new int [A.length + 1] [B.length + 1];
		int temp = 0;
		StringBuilder result = new StringBuilder();
		int count = 0;
		for (int i = 1; i < A.length; i++){
			for (int j = 1; j < B.length; j++){
				if (A[i - 1] == B[j - 1]){	
					matrix[i][j] = matrix[i-1][j-1] + 1;
					if (matrix[i][j] > count){
						count = matrix[i][j];
						temp = i;
					}
				}
				
			}	
		}
		for (int i = 1; i <= count; i++){
			result.append(A[temp - i]);
		}
		result = result.reverse();
		return result.toString();
	}
