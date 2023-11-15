package oops_encapsulation;

public class classB {
	
public static void main(String[] args) {
	classA sci=new classA();
	sci.getName();
	sci.setSalary(123000);
	System.out.println("emp name : "+sci.getName());
	System.out.println("emp salary : "+sci.getSalary());
}
}
