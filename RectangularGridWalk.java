//Problem: Given m*n board (chess/checker), count the number of rectangles 
	//Solution: A Rectangle is formed by 2 vertical and horizontal line. => There are C(m,2) * C(n,2) different
	//way to pick these lines.
	public static int factorial (int count){
		int result = 1;
		for (int i = 1; i <= count; i++){
			result = result * i;
		}
		return result;
	}
	public static double countRectangle (int m, int n){
		double result = factorial(m + 1)/(factorial(2) * factorial(m - 1)) * factorial(n + 1)/(factorial(2) * factorial(n - 1));
		return result;
	}
	public static void main (String args[]){
		int m = 8;
		int n = 8;
		System.out.println(countRectangle(m,n));
	}
