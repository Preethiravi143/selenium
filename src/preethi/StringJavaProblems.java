package preethi;

public class StringJavaProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ab cd";
//		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
//			reverse = reverse+ name.charAt(i);
			StringJavaProblems stringJavaProblems = new StringJavaProblems();
			char letter = stringJavaProblems.myCharAt(i, name);
			System.out.println(letter);
		}
	}

	public char myCharAt(int position,String name){
		return name.charAt(position);
	}

	public char charAt(int index) {
		//any operation
		return 'x';
	}
}
	