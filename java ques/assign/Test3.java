package assign;

import java.lang.reflect.Array;
import java.util.Arrays;

// practicing the string programs

// converting the char into string 

//public class Test3 {
//
//	public static void main(String[] args) {
//		String a = "vasu chinna";
//		char ch[] = { 't', 'a', 't', 'a', ' ', 'b', 'i', 'r', 'l', 'a' };
//		String b = new String(ch);
//		String c = new String("comedy");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//
//	}
//
//}

// adding the two strings by using the concat function 

//public class Test3{
//	public static void main(String[] args) {
//		String a="vasu";
//		String b=a.concat(" chinna");
//		System.out.println(b);
//	}
//}

// comparing the two strings are equal or not

//public class Test3{
//	public static void main(String[] args) {
//		String a="vasu";
//		String b="chinna";
//		String c="vasu";
//		String d=new String ("rrr");
//		System.out.println(a.equals(c));
//		System.out.println(a.equals(b));
//		System.out.println(b.equals(d));
//		
//	}
//}

// by using ==operator we can compare the strings

//public class Test3{
//	public static void main(String[] args) {
//		
//		String a="vasu";
//		String b="chinna";
//		String c="vasu";
//		System.out.println(a==b);
//		System.out.println(b==c);
//		System.out.println(c==a);
//		
//	}
//}

// Splitting the string in the program

//public class Test3 {
//
//	public static void main(String args[]) {
//		String a=new String("hello , world");
//		String s[]=a.split("\\.");
//		System.out.println(Arrays.toString(s));
//		
//	}
//}

// joining the string by using the stringbuffer and stringbuilder 

// joining the string by using the stringbuffer

//public class Test3{
//	public static void main(String[] args) {
//		StringBuffer buf=new StringBuffer("hello");
//		buf.append(" vasu");
//		System.out.println(buf);
//	}
//}

// joining the string by using the stringbuilder

//public class Test3{
//	public static void main(String[] args) {
//		StringBuilder buf=new StringBuilder("hello");
//		buf.append(" vasu");
//		System.out.println(buf);
//	}
//}

// Performance Test of StringBuffer and StringBuilder

//public class Test3{  
//    public static void main(String[] args){  
//        long startTime = System.currentTimeMillis();  
//        StringBuffer sb = new StringBuffer("Java");  
//        for (int i=0; i<10000; i++){  
//            sb.append("Tpoint");  
//        }  
//        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
//        startTime = System.currentTimeMillis();  
//        StringBuilder sb2 = new StringBuilder("Java");  
//        for (int i=0; i<10000; i++){  
//            sb2.append("Tpoint");  
//        }  
//        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
//    }  
//}  

// printing the array list 

//public class Test3{
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(i);
//		}
//		
////		for(int num:arr) {
////			System.out.println(num);
//		}
//	}


// creating the static variable 

//class Test3
//{
//static int count=0;   
//Test3()
//{
//count++;  
//System.out.println(count);  
//}  
//public static void main(String args[])
//{
//	Test3 c1=new Test3();  
//	Test3 c2=new Test3();  
//	Test3 c3=new Test3();  
//}
//}

// static and non static methods

//class Test3 {
//	void fun1() {
//		System.out.println("Hello I am Non-Static");
//	}
//
//	static void fun2() {
//		System.out.println("Hello I am Static");
//	}
//
//
//	public static void main(String args[]) {
//		Test3 oa = new Test3();
//		oa.fun1(); // non static method
//		Test3.fun2(); // static method
//	}
//}


// static block example 

//
//class Test3{
//	   static int val_1;
//	   int val_2;
//	   static{
//	      val_1 = 67;
//	      System.out.println("The static block has been called.");
//	   }
//	
//	
//
//	   public static void main(String args[]){
//	      System.out.println(Test3.val_1);
//	   }
//	}


// this keyword example

//class Test3
//{
// Double width, height, depth;
// Test3 (double w, double h, double d)
// {
//  this.width = w;
//  this.height = h;
//  this.depth = d;
// }
// public static void main(String[] args) {
//	 Test3 d = new Test3(10,20,30);
//	 System.out.println("width = "+d.width);
//	 System.out.println("height = "+d.height);
//	 System.out.println("depth = "+d.depth);
// }
//}

// default constructor example 

//public class Test3 {
//	  String firstName;
//	  String lastName;
//	  int age;
//	  
//	  public static void main(String args[]) {
//		  Test3 myStudent = new Test3();
//	      
//	      myStudent.firstName = "vasu";
//	      myStudent.lastName = "chinna";
//	      myStudent.age = 25;
//	      
//	      System.out.println(myStudent.age);
//	      
//	      
//	      System.out.println(myStudent.firstName);
//	    
//	  }
//	}

// parameterized constructor


//public class Test3 {
//	  String firstName;
//	  String lastName;
//	  int age;
//
//	  
//	  public Test3(){
//	      firstName = "vasu";
//	      lastName = "chinna";
//	      age = 26;
//	  }
//	  
//	  public static void main(String args[]) {
//		  Test3 myStudent = new Test3();
//	      System.out.println(myStudent.age);
//	      System.out.println(myStudent.firstName);
//	      System.out.println(myStudent.lastName);
//	      
//	  }
//	}


























