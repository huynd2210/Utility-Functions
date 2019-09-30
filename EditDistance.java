//Levenshtein Distance
public static int EditDistance(char [] A, char [] B){
		int matrix [][] = new int [A.length + 1][B.length + 1];
		for (int i = 0; i <= A.length; i++){
			matrix[i][0] = i;	
		}
		for (int j = 0; j <= B.length; j++){
			matrix[0][j] = j;
		}
		for (int j = 1; j <= B.length; j++){
			for (int i = 1; i <= A.length; i++){
				if (A[i - 1] == B[j - 1]){
					matrix[i][j] = matrix[i - 1][j - 1];
				}else{
					int temp = Math.min(matrix[i - 1][j] + 1, matrix[i][j-1] + 1);
					matrix[i][j] = Math.min(temp, matrix[i - 1][j - 1] + 1);
					
//					System.out.println("deletion: " + matrix[i - 1][j] + 1);
//					System.out.println("insertion: " + matrix[i][j - 1] + 1);
//					System.out.println("substitution: " + matrix[i - 1][j - 1] + 1);
				}
				//System.out.println(matrix[i][j]);
			}
			
		}
		return matrix[A.length][B.length];
	}
