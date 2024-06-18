package practice.multithreding;

public class MT01_MyThred {
	public static void main(String[] args) {
		MyThred th1 = new MyThred();
		MyThred th2 = new MyThred();
		th1.start();
		th2.start();
		RunThread run1 = new RunThread();
		RunThread run2 = new RunThread();
		Thread t2 = new Thread(run2);
		Thread t1 = new Thread(run1);
		t1.start();
		t2.start();
	}
}

class MyThred extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getId() + " Value " + i);
		}

	}
}

class RunThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getId() + " Value " + i);
		}

	}
}