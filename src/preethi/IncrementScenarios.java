package preethi;

public class IncrementScenarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int i=a;
		
		int b=0;
		int j=++b;  // this will perform the increment first and then will update the value to j; here b value will also gets update for sure now b will 1 not 0
		System.out.println("b="+b);
		int z = b++; // here b value will starts from 1 because it had been update from ++b operation; so here z value will gets initialized first so z value will be 1, then b value will get incremented to 2 now
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("z="+z);
	}

}
