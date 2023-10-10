package exercise;

import java.util.Scanner;

public class LoopProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner r = new Scanner(System.in);
//		System.out.println("enter a number:");
//		int n = r.nextInt();
		int n = 7;
		int v1 = 0;
		int v2 = 1;
		for (int i = 0; v1+v2 <= n ; i++) {
			int result = v1 + v2;
			v1 = v2;
			v2 = result;

//			System.out.println("v1 = " + v1);
//			System.out.println("v2 = " + v2);
			System.out.println("result = " + result);
			System.out.println("-------------------XZ");
		}
		
		
		
	}
}
