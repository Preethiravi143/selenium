package workout;

public class VariablesAndDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 10;
		System.out.println(myNum + "is the best of the best");

		String quote = "I am the owner of the best ever";
		System.out.println(quote);

		char letterR = 'r';
		System.out.println(letterR + "i am the lover of ravi kutty");

		double dec = 8.009;
		System.out.println(dec);

		boolean isBoolean = false;
		System.out.println(isBoolean);

		int[] arrayOfInteger = new int[4];
		arrayOfInteger[0] = 10;
		arrayOfInteger[1] = 7;
		arrayOfInteger[2] = 2;
		arrayOfInteger[3] = 3;
		System.out.println(arrayOfInteger[0]);

		for (int i = 0; i < arrayOfInteger.length; i++) {
			System.out.println(arrayOfInteger[i]);
		}
		// for (int i = arrayOfInteger.length-1;i>=0; i--) {
		// System.out.println(arrayOfInteger[i]);
	}

}
