package PredefinedThreadMethods;

public class Calculator extends Thread {

	void series1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {

			}
		}
	}

	void series2() {
		for (char a = 'A'; a <= 'J'; a++) {
			System.out.println(a);
		}
	}

	void support() {
		for (int i = 1; i < 100000000; i++) {
			System.out.println(i + "Support");
		}
	}

	@Override
	public void run() {
		if (currentThread().getName().equals("Andrew")) {
			series1();
		}

		if (currentThread().getName().equals("Angie")) {
			series2();
		}

		if (currentThread().getName().equals("Ravi")) {
			support();
		}
	}

	public static void main(String[] args) throws Exception {

		Calculator cal = new Calculator(); // object + thread
		cal.setName("Andrew");
		cal.start();
		// cal.join(); // checked Exception
		// join methods restrict other thread to execute while executing joined Thread

		Calculator cal3 = new Calculator();
		cal3.setName("Ravi");
		cal3.setDaemon(true);
		cal3.start();

		Calculator cal2 = new Calculator();
		cal2.setName("Angie");
		cal2.start();

	}

}
