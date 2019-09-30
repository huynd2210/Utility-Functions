public class NthPrime {
	public static void main (String args []){
		int i,n,m;
		n = 5;
		int a = 0;
		System.out.println("Loading");
		for (i = 1;i <= n;i++)		
		{
			int count = 0;
			for (m=i;m>=1;m--)
			{				
				if (i%m == 0){
					count +=1;
				}
			}
			if (count == 2){
				a += 1;
				if (a == 6){
					System.out.println(a + ". " + i);
					break;
				}
			}
		}
		System.out.println("Done");
	}
}
	
