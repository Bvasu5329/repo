package types_interfaces;

import java.util.List;  
import java.util.ArrayList;  
interface MyInterface {  
    void printMessage();  
}  
class MyClass implements MyInterface {  
    @Override  
    public void printMessage() {  
        System.out.println("Hello, World!");  
    }  
}  
public class Normal_Interfaces {  
    public static void main(String[] args) {  
        MyInterface obj = new MyClass();  
        obj.printMessage(); 
    }  
} 
