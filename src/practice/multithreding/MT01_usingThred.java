package practice.multithreding;

public class MT01_usingThred {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();

	}

}

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Th:" + Thread.currentThread().getId() + " - value:" + i);
		}
	}
}