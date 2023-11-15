package inner_class;

public class inner_class_nested {

	 
		 private int data=456;  
		 class Inner{  
		  void msg(){System.out.println("data is "+data);}  
		 }  
		 public static void main(String args[]){  
			 inner_class_nested obj=new inner_class_nested();  
			 inner_class_nested.Inner in=obj.new Inner();  
		  in.msg();  
		 }  
		}  

