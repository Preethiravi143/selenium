package exercise;

public class MultiDimensionalArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		for (int i = 0; i < myNumbers.length; i++) {
			System.out.println(myNumbers[i][0]);
			for (int k = 0; k < myNumbers[i].length; k++) {
				System.out.println(myNumbers[i][k]);
			}
		}

	}

}
