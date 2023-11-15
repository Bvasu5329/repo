package ann_class;

abstract class Person {
	abstract void eat();
}

class annomous_class {
	public static void main(String args[]) {
		Person p = new Person() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}
}
