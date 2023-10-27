package exercise;

public class Constructor {
	int x;
	public Constructor(int y) {
		//y = 5
		y=x; // y=0
		//y = 0
		System.out.println("i am the costructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor three = new Constructor(5);
		System.out.println(three.x);
	}

}
