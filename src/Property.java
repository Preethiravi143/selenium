
public class Property {

	private String name;
	
	public int length2; 

	public String getName() {
		return this.name;
	}

	public void setName(String name2) {
		length2 = name2.length();
		name = name2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Property prop = new Property();
		System.out.println(prop.name);
		prop.setName("preethi");
		System.out.println(prop.name);
		Property prop1 = new Property();
		System.out.println(prop1.name);
		
	}
}
