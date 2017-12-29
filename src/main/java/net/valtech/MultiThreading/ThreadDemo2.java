package net.valtech.MultiThreading;

class MyRunnable implements Runnable {

	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("child thread");
		}
	}
}

class ThreadDemo2 {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		//Thread t1 = new Thread();
		 Thread t2 = new Thread(r);// here r is a Target Runnable
		// t1.start();
		//t1.run();
		 //t2.start();
		 //t2.run();
		// r.start();
		 //r.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}
