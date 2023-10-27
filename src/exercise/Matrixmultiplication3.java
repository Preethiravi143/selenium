package exercise;

public class Matrixmultiplication3 {

	public static void main(String[] args) {
		int[][] a = {{1,1,1},{1,1,1},{1,1,1}};//to know the no of rows it is easy.Here no.of rows=3,to know the columns we need the first row, from that itself we can count the columns
		int[][] b = {{1,1,1},{1,1,1},{1,1,1}};
		int[][] result = new int[a.length][b[0].length];// here we can give values.[a.length] indicates no.of values like we did in int[] a = new int[5]; here we dont know the no of values or length of the array so we are using this .length method
		for (int row =0; row<=a.length-1;row++) {
			for (int col=0; col<=b[0].length-1;col++) {
				result[row][col] = a[row][0]*b[0][col]+a[row][1]*b[1][col]+a[row][2]*b[2][col];
				System.out.print(result[row][col]);
				System.out.print(" ");
			}
			System.out.println("");
		}
			
		// TODO Auto-generated method stub

	}

}
