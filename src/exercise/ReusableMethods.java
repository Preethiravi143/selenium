package exercise;

public class ReusableMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReusableMethods ravi = new ReusableMethods();
		int[] array = { 10, 7, 2, 4 };
		int[] array2 = { 20, 7, 2, 4, 8, 9, 22 };

		System.out.println(ravi.getData(array));
		ravi.getData(array)
		System.out.println(ravi.getData(array2));
//				int result = ravi.getData(array2);
//				System.out.println(result);
	}

	public int getData(int[] additionResult) {
		int result = 0;
		for (int i = 0; i < additionResult.length; i++) {
			result = result + additionResult[i];

		}
		return result;

	}
}
