//Generate keys for x-digit passcode. E.g integer 45 => String 0045 


public class IntegerPadding{
	public static String padding(int temp) {
		String result = Integer.toString(temp);
		while(result.length() < 4) {
			result = "0" + result;
		}
		return result;
	}
	
	public static void main(String args[]) {
		int temp = 45;
		String keys = "";
		for (int i = 0; i < 10000; i++) { //Generate keys
			temp = i;
			keys = padding(temp);
			System.out.println(keys);
		}
		
	}
}
