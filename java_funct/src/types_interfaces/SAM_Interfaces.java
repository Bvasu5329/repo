package types_interfaces;

interface MySAMInterface {  
    void performAction();  
}  
public class SAM_Interfaces {  
    public static void main(String[] args) {  
        MySAMInterface obj = () -> System.out.println("Performing action");  
        obj.performAction();  
    }  
} 
