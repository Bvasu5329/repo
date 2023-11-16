package java_lambda;

interface Sayable{  
    public String say(String name);  
}  
  
public class lambda{  
    public static void main(String[] args) {  
        
        Sayable s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("vasu"));  
          
          
        Sayable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("chinna"));  
    }  
}  

