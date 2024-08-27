package MultiTHreading2;

public class Calculator implements Runnable {

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

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Chris")) {
			series1();
		}

		if (Thread.currentThread().getName().equals("Zaynab")) {
			series2();
		}

	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		Thread t1 = new Thread(cal);
		t1.setName("Chris");
		t1.start();

		Thread t2 = new Thread(cal);
		t2.setName("Zaynab");
		t2.start();

//		cal.series1();
//		cal.series2();

	}

}
