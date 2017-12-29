package net.valtech.MultiThreading;

class MyThread extends Thread {

	public void run()

	{

		for (int i = 0; i < 10; i++) {

			System.out.println("Child Thread");
		}

	}

}

class ThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();// Instantiation of a Thread
		//t.start();// starting of a Thread
		//t.run();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}
}
