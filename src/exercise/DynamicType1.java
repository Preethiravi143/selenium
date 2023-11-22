package exercise;

import java.util.ArrayList;

public class DynamicType1<T> {
	T[] value;
	
	

	public void add(T[] value1) {
		value = value1;
	}

	public T[] setValueandgetit(T[] value2) {
		value = value2;
		return value;
	}
	public void update(int position,T newValue) {
		value[position]= newValue;
	}
	
	public T get(int position) {
		return value[position];
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> dynamicTypeArrayList1 = new ArrayList<String>();
		
		
		DynamicType1<String> dynamicTypeArrayList = new DynamicType1<String>();
		String[] name = {"workout","ravi"};
		String newValue1= "royal";
		
		dynamicTypeArrayList.add(name);		
		dynamicTypeArrayList.update(0,newValue1);
		System.out.println(dynamicTypeArrayList.get(0));		
//		
		System.out.println(name[0]);
		System.out.println(newValue1);
//		DynamicTypeArrayList<int[]> dynamicTypeArrayList1 = new DynamicTypeArrayList<int[]>();
//		int[] number = {1,2,3};
//		dynamicTypeArrayList1.get(number);
//		System.out.println(number[0]);
//		DynamicTypeArrayList<Integer> dynamicTypeArrayList2 = new DynamicTypeArrayList<Integer>();
		
	
	}

}
