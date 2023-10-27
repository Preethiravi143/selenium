package exercise;

public class Matrixmultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2 }, { 3, 4 } };
		int[][] b = { { 5, 6 }, { 7, 8 } };
		int[][] result = new int[a.length][b[0].length];
		for (int row=0;row<=a.length-1;row++) {
			for (int col=0; col<=b[0].length-1;col++) {
				result[row][col]= a[row][0]*b[0][col] + a[row][1]*b[1][col];
			}
		}
		for (int row=0;row<=result.length-1;row++) {
			for (int col=0; col<=result[0].length-1;col++) {
				System.out.print(result[row][col]);	
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
