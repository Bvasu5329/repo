package java_100_questions;

import java.util.Scanner;

// writing the code to print the even numbers

//public class sandpra {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number to check ");
//		int a=sc.nextInt();
//		if (a%2==0) {
//			System.out.println("the number is even");
//		}
//		else {
//			System.out.println("the number is odd");
//		}
//		
//	}
//
//}

// finding the sum of even numbers and odd numbers

//public class sandpra {
//	public static void main(String[] args) {
//		
//		int sumE=0;
//		int sumO=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter how many numbers u want to enter : ");
//		int t = sc.nextInt();
//		int a[] = new int[t];
//		System.out.println("enter the elements here :");
//		for (int i = 0; i < a.length; i++) {
//
//			a[i] = sc.nextInt();
//		}
//		for (int i = 0; i < t; i++) {
//			if (a[i]%2==0) {
//				sumE=sumE+a[i];
//				
//			}
//			else {
//				sumO=sumO+a[i];
//			}
//		}
//		System.out.println("the sum of all even numbers are : "+sumE);
//		System.out.println("the sum of all odd numbers are : "+sumO);
//
//	}
//}

// printing the number is even or odd

//public class sandpra{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number : ");
//		int a=sc.nextInt();
//		if (a<0) {
//			System.out.println("the number is negative ");
//			
//		}
//		else {
//			System.out.println("the number is positive ");
//		}
//	}
//}

// Palindrome Checker: Write a Java program to check if a given string is a palindrome.
//
//public class sandpra {
//	public static void main(String[] args) {
//		String str="";
//		String rev = "";
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter string here : ");
//		 str = sc.nextLine();
//		 int length=str.length();
//		for (int i =length-1; i >= 0;  i--) {
//			rev = rev + str.charAt(i);
//
//		}
//		if (str.equals(rev)) {
//			System.out.println("the number is palindrome");
//		} else {
//			System.out.println("the number is not palindrome");
//		}
//
//	}
//}

// checking the two strings are equal or not

//public class sandpra{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string 1 : ");
//		String a=sc.nextLine();
//		System.out.println("enter the string 2 : ");
//		String b=sc.nextLine();
//		if(a.equals(b)) {
//			System.out.println("same string");
//		}
//		else {
//			System.out.println("different string");
//		}
//		
//		if (a.equalsIgnoreCase(b)) {
//			
//			System.out.println("same string");
//		}
//		else {
//			System.out.println("different string");
//		
//		}
//		
//	}
//}

// java program to remove the white spaces

//public class sandpra{
//	public static void main(String[] args) {
//		String a="            vasu   ";
//		System.out.println(a.trim());
//	}
//}

// concatinate two strings using the concat method

//public class sandpra{
//	public static void main(String[] args) {
//		String a="vasu";
//		String b="chinna";
//		String c=a.concat(b);
//		System.out.println("after : "+c);
//	}
//}

// java program to find the duplicate characters in a string

//public class sandpra {
//	public static void main(String argu[]) {
//
//		String str = "vasu chinna";
//		int cnt=0;
//		char[] inp = str.toCharArray();
//		
//		System.out.println("Duplicate Characters are:");
//		for (int i = 0; i < str.length(); i++) {
//			
//			for (int j = i +1; j < str.length(); j++) {
//				if (inp[i] == inp[j]) {
//					System.out.println(inp[i]);
//					
//					cnt++;
//					
//					break;
//					
//				}
//			}
//
//
//		}
//	}
//}



//public class sandpra {
//	public static void main(String arg[]) {
//		int num = 1295921, reverse = 0, remainder;
//
//		
//		int original = num;
//
//		
//		while (num != 0) {
//			remainder = num % 10;
//			reverse = reverse * 10 + remainder;
//			num =num/ 10;
//		}
//
//		if (original == reverse) {
//			System.out.println(original + " is Palindrome.");
//		} else {
//			System.out.println(original + " is not Palindrome.");
//		}
//	}
//
//}
