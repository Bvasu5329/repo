package oops_interface;

public interface interface_car {
	
	public void engine();
	public void tyres();
	public void instrument_console();
	public void lights();
	default void sunroof() {
		System.out.println("it is an panaromic sunroof");
	}
	private void speed() {
		System.out.println("code reusability speed");
	}
	

}
