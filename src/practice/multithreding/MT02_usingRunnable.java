package practice.multithreding;

public class MT02_usingRunnable {
	public static void main(String[] args) {
		MyThread1 r1 = new MyThread1();
		MyThread1 r2 = new MyThread1();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}

class MyThread1 implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("th:" + Thread.currentThread().getId() + "-value:" + i);
		}
	}
}
