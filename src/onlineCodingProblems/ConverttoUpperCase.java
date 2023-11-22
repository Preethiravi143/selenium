package onlineCodingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverttoUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConverttoUpperCase converttoUpperCase = new ConverttoUpperCase();
		List<String> test = Arrays.asList("preethi","ravi");
		List<String> result = converttoUpperCase.upperCase(test);
		System.out.println(result);
	}

	public List<String> upperCase(List<String> list) {
		List<String> result = new ArrayList<String>();
		for(String newValue : list) {
			String result1 = newValue.toUpperCase();
			result.add(result1);
		}
		
		
		return result;
	}
	
}
