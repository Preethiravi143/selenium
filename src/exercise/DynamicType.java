package exercise;

public class DynamicType<T> {
	T variable;
	
	public void add(T var1) {
		 variable = var1;
	}
	
	public T get() {
		return variable;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicType<String> strType = new DynamicType<String>();
		strType.add("test");

		DynamicType<Integer> intType = new DynamicType<Integer>();
		intType.add(1);
		//intType.add("1");
	}

}
