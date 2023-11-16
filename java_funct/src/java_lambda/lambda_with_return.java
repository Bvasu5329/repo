package java_lambda;

interface Addable {
	int add(int a, int b);
}

public class lambda_with_return {
	public static void main(String[] args) {

		Addable ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(17, 298));

		Addable ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(187, 276));
	}
}
