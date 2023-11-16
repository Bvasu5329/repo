package types_interfaces;

import java.util.function.Predicate;

public class Functional_Interfaces {
	public static void main(String[] args) {
		Predicate<String> isLengthGreaterThan5 = str -> str.length() > 5;
		System.out.println(isLengthGreaterThan5.test("Hello")); 
		System.out.println(isLengthGreaterThan5.test("OpenAI"));
	}
}
