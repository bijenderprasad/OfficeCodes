package Arrays;

interface test {
	void run();
}

public class AnymousClass {

	public static void main(String[] args) {
		test t = new test() {

			@Override
			public void run() {
				System.out.println("this is pradeep method");

			}

		};

		test t2 = new test() {
//comment added
			@Override
			public void run() {
				System.out.println("this is Bijender original method");
				
			}
			
		};
		t.run();
		t2.run();

	}

}
