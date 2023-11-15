package oops_inheritance;

public class Science extends IDA {

	float bonus = 23000;
	public static void main(String[] args) {

		Science sci=new Science();
		sci.total_sal=sci.bonus+sci.hra+sci.salary+sci.salary;
		System.out.println("gross salary : "+ sci.total_sal);
		
		
	}

}
