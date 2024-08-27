package MultiThreading4;

public class Calculator {

	void series1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	void series2() {
		for (char a = 'A'; a <= 'J'; a++) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		Runnable run1 = () -> {
			cal.series1();
		};

		Runnable run2 = () -> {
			cal.series2();
		};

		Thread t1 = new Thread(run1);
		t1.start();

		Thread t2 = new Thread(run2);
		t2.start();

	}

}
