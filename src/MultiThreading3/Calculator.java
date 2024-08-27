package MultiThreading3;

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

		Thread t1 = new Thread() {
			@Override
			public void run() {
				cal.series1();
			}
		};
		t1.setName("ABC");
		t1.start();

		Thread t2 = new Thread() {
			@Override
			public void run() {
				cal.series2();
			}
		};
		t2.setName("XYZ");
		t2.start();

	

	}

}
