package Synchronisation;

public class Restaurant extends Thread {
	int stock = 3;

	void order() {

		if (stock > 0) {
			System.out.println(Thread.currentThread().getName() + " Placed");

			stock--;
			System.out.println(stock);
		} else {
			System.out.println("Out Stock");
		}

	}

	@Override
	public void run() {
		synchronized (this) {
			order();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurant rest = new Restaurant();

		Thread t1 = new Thread(rest);
		t1.setName("A");
		t1.start();

		Thread t2 = new Thread(rest);
		t2.setName("B");
		t2.start();

		Thread t3 = new Thread(rest);
		t3.setName("C");
		t3.start();

		Thread t4 = new Thread(rest);
		t4.setName("D");
		t4.start();

		Thread t5 = new Thread(rest);
		t5.setName("E");
		t5.start();

	}

}
