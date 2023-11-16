package types_interfaces;
import java.io.Serializable; 

	interface MyMarkerInterface extends Serializable {  
	}  
	public class Marker_Interfaces {  
	    public static void main(String[] args) {  
	        MyMarkerInterface obj = new MyMarkerInterface() {  
	        };  
	        System.out.println(obj instanceof Serializable); // true  
	    }  
	}  
	


