
public class Calculator extends Thread {

	void series() throws Exception {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				throw new Exception("i reached at 5");
			}
			System.out.println(i);
		}
	}

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sub(int a, int b) {
		System.out.println(a - b);
	}

	@Override
	public void run() { // overrided from thread class
		// all 3 threads will reach to run method
		// after reaching to this point we will assign each method to thread
		if (currentThread().getName().equals("Meti")) {
			try {
				series();
			} catch (Exception e) {

			}
		}

		if (currentThread().getName().equals("Roberto")) {
			sum(23, 45);
		}

		if (currentThread().getName().equals("Jordan")) {
			sub(23, 12);
		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());

		Calculator cal1 = new Calculator(); // object + thread
		cal1.setName("Meti");
		Calculator cal2 = new Calculator();
		cal2.setName("Roberto");
		Calculator cal3 = new Calculator();
		cal3.setName("Jordan");

		cal1.start(); // starting our each thread
		cal2.start();
		cal3.start();
//		
//		
//		cal.series();
//		cal.sum(12, 20);
//		cal.sub(23, 12);

	}

}
