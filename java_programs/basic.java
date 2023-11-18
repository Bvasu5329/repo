package java_programs;

import java.util.Scanner;

//Swap Two Number

//public class basic {
//
//	public static void main(String[] args) {
//		int a=11;
//		int b=33;
//		int t;
//		System.out.println("numbers before swaping : "+a +" "+b);
//		
//		t=a;
//		a=b;
//		b=t;
//		System.out.println("numbers before swaping : "+a +" "+b);
//	}
//
//}

//Reverse A Number

//public class basic {
//
//	
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter any number here : ");
//		int num = sc.nextInt();
//		int rev = 0;
//		while (num != 0) {
//
//			rev = (rev * 10) + (num % 10);
//			num = num / 10;
//
//		}
//		System.out.println("reverse number is : " + rev);
//	}
//}

// reversing a string

//public class basic {
//	public static void main(String[] args) {
//
//		System.out.println("Enter a String as you wish: ");
//
//		Scanner scan = new Scanner(System.in);
//
//		String str = scan.nextLine();
//		System.out.println("Reserve of given String " + str + " is : ");
//		int i = str.length();
//		while (i > 0) {
//			System.out.print(str.charAt(i - 1));
//			i--;
//			scan.close();
//		}
//
//	}
//}

// palindrome number 

//public class basic {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter any number here : ");
//		int num = sc.nextInt();
//		int org_num = num;
//		int temp = 0;
//		while (num != 0) {
//			temp = (temp * 10) + (num % 10);
//			num = num / 10;
//		}
//		if (temp == org_num) {
//			System.out.println("the number is palindrome");
//		} else {
//			System.out.println("the number is not a palindrome");
//		}
//	}
//}

// palindrome string 

//public class basic {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter some string here :");
//		String str = sc.nextLine();
//		String org_str = str;
//		int i = str.length();
//		String rev = "";
//		while (i > 0) {
//			rev = rev + str.charAt(i - 1);
//			i--;
//		}
//		System.out.println(rev);
//		if (org_str.equals(rev)) {
//			System.out.println("the given string is palindrome string");
//		} else {
//			System.out.println("the given string is not a palindrome string");
//		}
//
//	}
//}

// count number of digits

//public class basic{
//	public static void main(String[] args) {
//		Scanner sc= new Scanner (System.in);
//		System.out.println("enter the number to count : ");
//		long num=sc.nextInt();
//		int count =0;
//		while(num>0) {
//			num=num/10;
//			count++;
//		}
//		System.out.println(count);
//	}
//}

// count number of even and odd digits

public class basic {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		int even_count = 0;
		int odd_count = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}

		}
		sc.close();
		System.out.println("the even count is :" + even_count);
		System.out.println("the odd count is :" + odd_count);
		System.out.println(rem);
	}
}
