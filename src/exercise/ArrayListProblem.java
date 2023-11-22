package exercise;

import java.util.ArrayList;

public class ArrayListProblem {
	int myNum;

	public ArrayListProblem(int val) { 
		myNum = val;
	}

	public boolean isEven() {
		return Maths.isEven(myNum);
//		if(myNum % 2 ==0) {
//			return true;
//		} else {
//			return false;
//		}
	}

	public boolean isGreaterOrNot() {
		return myNum > 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayListProblem> arrayListsData = new ArrayList<ArrayListProblem>(1);
		
		ArrayListProblem firstObj = new ArrayListProblem(1);
		arrayListsData.add(firstObj);

		ArrayListProblem secondObj = new ArrayListProblem(2);
		arrayListsData.add(secondObj);

		for(ArrayListProblem arrayListData: arrayListsData) {
			boolean varName = arrayListData.isEven();
			boolean varName1 = arrayListData.isGreaterOrNot();

			System.out.println(varName);
			System.out.println(varName1);
		}
		
		ArrayList<ArrayList<ArrayListProblem>> arrayListsofListsData = new ArrayList<ArrayList<ArrayListProblem>>();
		
		arrayListsofListsData.add(arrayListsData);

		System.out.println("----------");
		for(ArrayList<ArrayListProblem> arrayListsofListData: arrayListsofListsData) {
			for(ArrayListProblem arrayListofListData: arrayListsofListData) {
				boolean varName = arrayListofListData.isEven();
				System.out.println(varName);
			}
		}
		ArrayList<String> myName = new ArrayList<String>();
		myName.add("Ravi");
		myName.add("preethi");
		ArrayList<String> names = new ArrayList<String>();
		myName.add("poomathi");
		myName.add("mani");
				
		ArrayList<ArrayList<String>> myName1 = new ArrayList<ArrayList<String>>();
		myName1.add(myName);
		myName1.add(names);
		ArrayList<String> name = myName1.get(0);
		String requiredName = name.get(0);
		System.out.println(requiredName);
		
		for(ArrayList<String> myName11: myName1) {
			for(String myName12: myName11) {
				System.out.println(myName12);
				
			}
		}
		
	}

}
