// The sieve of Eratosthenes is an algorithm for finding all prime numbers up to any given 
// limit
public class SieveOfEratothenes {
	public static void sieve (int n){
	boolean prime [] = new boolean [n + 1];
	for (int i = 0; i < n; i++){
		prime[i] = true;
	}
	for (int i = 2; i*i < n; i++){
		if (prime[i] == true){
			for (int j = i*2; j <= n; j+=i){
				prime[j] = false;
			}
		}
	}
	for (int i = 2; i <= n; i++){
		if (prime[i] == true){
			System.out.println(i);
			}
		}
	}
	public static void main (String args[]){
		int n = 2000000;
		//int sum = sieve(n);
	//	System.out.println(sum);
		sieve(n);
	}

	
}
