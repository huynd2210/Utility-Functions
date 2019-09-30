// Calculate the Greatest Common Divisor and Least Common Multiple	
	public static int GCD (int a, int b){ //Euclidean Algorithm for Greatest Common Divisor
		while (b != 0){
			int r = a % b;
			int result = GCD(b,r);
			return result;
		}
		return a;
	}

	public static int GCDIterative(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}	
		return p;
	}	
	public static int multipleGCD(int [] array){
		int result = 0, a = array[0], b = array[1];
		result = GCD(a,b);
		for (int i = 2; i < array.length; i++){
			a = result;
			b = array[i];
			result = GCD(a,b);
		}
		return result;
	}
	public static double LCM(int a, int b){
		double lcm = (Math.abs(a * b))/GCD(a,b);
		return lcm;
	}
	public static double multipleLCM(int [] array){
		double result = 0;
		int a = array[0], b = array[1];
		result = LCM(a,b);
		for (int i = 0; i < array.length; i++){
			a = (int) result;
			b = array[i];
			result = LCM(a,b);
		}
		return result;
	}
