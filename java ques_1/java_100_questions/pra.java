package java_100_questions;

import java.util.Scanner;

//public class pra {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number you want for palindrome : ");
//		int a = sc.nextInt();
//		int temp = a;
//		int rev = 0;
//		int dig;
//		while (a > 0) {
//			dig = a % 10;
//			rev = rev * 10 + dig;
//			a = a / 10;
//		}
//		if (temp == rev) {
//			System.out.println("the number is palindrome ");
//		} else {
//			System.out.println("the number is not palindrome");
//		}
//
//	}
//
//}

//a=int(input("enter the number : "))
//temp=a;
//rev=0;
//while(a>0) {
//    dig=a%10
//    rev=rev*10+dig
//    a=a//10
//if temp==rev:
//    print("the number is palindrome")
//else:
//    print("the number is not palindrome")



// creating the anonymous object



public class pra
{
  String name = "Hyundai";	
  void start() {
	 System.out.println("Engine started.");
  }
  void stop() {
	 System.out.println("Engine stopped.");
  }
 public static void main(String[] args) 
 {

   System.out.println("Car name: " +new pra().name);

   
   new pra().start();
   new pra().stop();
  }
}





