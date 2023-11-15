package wednes_upcast_downcast;

class Par {
	String name;

	void showMessage() {
		System.out.println("Parent method is called");
	}
}

class Chi extends Par {
	int age;

	@Override
	void showMessage() {
		System.out.println("Child method is called");
	}
}

public class downcast {

	public static void main(String[] args) {

		Par p = new Chi();
		p.name = "Shubham";

		Chi c = (Chi) p;

		c.age = 18;
		System.out.println(c.name);
		System.out.println(c.age);
		c.showMessage();
	}
}
