package exercise;

import java.util.Scanner;

public class LoopWithUseInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of iteration:");
		int totalIteration = sc.nextInt();
		int currentIteration = 1;
		while(++currentIteration<=totalIteration) {
			System.out.println(currentIteration);
		}
		
		
		
	}
}
