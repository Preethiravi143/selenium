package exercise;

public class RecursionBasics {

	public static void main(String[] args) {
		int factor = multiplyTillNumber(6);
		System.out.println(factor);
		// TODO Auto-generated method stub

	}

	public static int multiplyTillNumber(int endNumber) {
		if (endNumber <= 1) {
			return endNumber;
		}
		return endNumber * multiplyTillNumber(endNumber - 1);

	}
}
