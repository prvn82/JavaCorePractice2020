package MobileSetup.com;

public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str = "Praveen";
		char givenChar = 'e';
		int count = Str.length()-Str.replace(Character.toString(givenChar), "").length();
		System.out.println("Total number of "+givenChar+ " is "+count);
	}

}
