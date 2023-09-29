package exercise;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "first";
		String b = a;
		b = "second";
		System.out.println(a); //first
		System.out.println(b); //second

		int[] preethi = { 10, 7, 2, 4 };
		int[] ravi = preethi;
		ravi[0] = 15;
		
		System.out.println(preethi[0]); 
		System.out.println(ravi[0]); 

	}
}
