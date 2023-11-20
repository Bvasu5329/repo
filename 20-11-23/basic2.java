package java_programs;

import java.util.Scanner;


// Count Sum Of Digits in a Number

//public class basic2{
//	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter the number to count : ");
//		int num=sc.nextInt();
//		
//		int sum=0,dig;
//		while(num>0) {
//			dig=num%10;
//			sum=sum+dig;
//			num=num/10;
//			
//		}
//		System.out.println("the total digits are : "+sum);
//	}
//}

// finding the largest of three numbers 

//public class basic2 {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number to find biggest");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=sc.nextInt();
//		if (a>=b && a>=c){
//			System.out.println("the largest number is :"+a);
//		}
//			else if(b>=a && b>=c) {
//				System.out.println("the largest number is : "+b);
//				
//			}
//		
//			else {
//				System.out.println("the largest number is : "+c);
//			}
//			
//		}
//		
//	}

// Generate Fibonacci Series

//public class basic2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("please enter how many numbers u want : ");
//		int n = sc.nextInt();
//		int t1 = 0, t2 = 1;
//		System.out.println("Fibonacci Series of " + n + " terms:");
//
//		for (int i = 1; i <= n; ++i) {
//			System.out.print(t1 + ", ");
//
//			// compute the next term
//			int sum = t1 + t2;
//			t1 = t2;
//			t2 = sum;
//		}
//	}
//}

// checking the number is prime or not 

//public class basic2{
//	public static void main(String[] args) {
//		
//	
//	int count =0;
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter the number to check prime or not a prime : ");
//	int num=sc.nextInt();
//	for (int i=2;i<num;i++) {
//		if (num%i==0) {
//			count ++;
//			break;
//		}
//	}
//	if (count==0) {
//		System.out.println("it is a prime number ");
//	}
//	else {
//		System.out.println("it is not a prime number");
//	}
//	}
//}

// How to Generate Random Numbers & String

public class basic2{
	public static void main(String[] args) {
		int min=100;
		int max=200;
		double a=(Math.random())*(max-min+1)+min;
		System.out.println(a);
		
		int b=(int)((Math.random())*(max-min+1)+min);
		System.out.println(b);
	}
}





















