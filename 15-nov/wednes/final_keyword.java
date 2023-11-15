package wednes;

public class final_keyword {

	final int speedlimit = 90;

	void run() {
		int speedlimit = 400;
	}

	public static void main(String args[]) {
		final_keyword obj = new final_keyword();
		obj.run();
	}
}
