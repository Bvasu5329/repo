package come_project_1_folder;

//public class practice_1{

//	
//	static int a=76;
//	
//	
//	public static void main(String[]args) {
//		
//		if (a<0) {
//			System.out.println("The number is negative ...!");
//		}
//		else {
//			System.out.println("The number is positive...!");
//		}
//		
//	}
//}

//public class practice_1{
//	public static void main(String[] args) {
//		int month=2;
//		switch(month) {
//		case 1:
//			System.out.println("january");
//		break;
//		case 2:
//			System.out.println("february");
//		break;
//		case 3:
//			System.out.println("march");
//		break;
//		case 4:
//			System.out.println("april");
//		break;
//		default:
//			System.out.println("invalid number...!!..Try again");
//		}
//	}
//}

// writing the program to take the data from the user and print at once

//import java.util.*;
//
//public class practice_1{
//	public static void main(String[]args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your full name :");
//		String name=sc.nextLine();
//		System.out.println("Enter your age :");
//		int age=sc.nextInt();
//		System.out.println("Enter your salary :");
//		double salary=sc.nextDouble();
//		System.out.println("Are you happy today ? True/False");
//		boolean mood = sc.nextBoolean();
//		System.out.println("name: "+name+"\nage: "+age+"\nsalary : "+salary+"\nhappy : "+mood);
//	}
//}

//public class practice_1{
//	
//	
//	
//	public static void main(String[] args) {
//		 int a=23;
//		 int b=34;
//		 int c=a+b;
//		System.out.println(c);
//	}
//}

//public class practice_1 {
//	public static void main(String[] args) {
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//	}
//}

// creating the object from one class to another

//public class practice_1{
//	int i;
//	int j;
//	public practice_1() {
//		i=10;
//		j=20;
//	}
//		public practice_1 (int i,int j) {
//			this.i=i;
//			this.j=j;
//		}
//		public int add(){
//			return i+j;
//			
//		}
//	
//	public static void main(String[] args) {
//		practice_1 t1=new practice_1();
//		practice_1 t2=new practice_1(10,25);
//		practice_1 t3=new practice_1(80,50);
//		
//	System.out.println(t1.add());
//	System.out.println(t2.add());
//	System.out.println(t3.add());
//	
//	
//	
//	}
//}


//Fibonacci Series in Java without using recursion

//class practice_1 {
//	public static void main(String args[]) {
//		int n1 = 0, n2 = 1, n3, i, count = 10;
//		System.out.print(n1 + " " + n2);
//
//		for (i = 2; i < count; ++i) {
//			n3 = n1 + n2;
//			System.out.print(" " + n3);
//			n1 = n2;
//			n2 = n3;
//		}
//
//	}
//}
