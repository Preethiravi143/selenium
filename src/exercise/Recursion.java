	package exercise;

public class Recursion {
	int result = 0;

	public static void main(String[] args) {
		int num= Recursion.sum(6, 12); //6 and 12 are parameters for the method sum.
		System.out.println(num);
		// TODO Auto-generated method stub

	}

	public static int sum(int startValue, int endValue) { // startValue and endValue are arguments with int type.
		if (startValue > endValue) {
			return endValue;

		}
		return endValue + sum(startValue, endValue - 1);
	}

}
