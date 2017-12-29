package net.valtech.MultiThreading;

class MyThread2 extends Thread {
	// Overriding of run Method
	/*
	 * public void run() { System.out.println("no arg method"); } public void
	 * run(int i) { System.out.println("int arg method"); }
	 */

	/*public void start() {
		super.start();
		System.out.println("start method");
	}*/

	/*public void run() {
		System.out.println("run method");
	}*/

}

class ThreadDemo1 {
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		MyThread2 t = new MyThread2();
		Thread.currentThread().setName("SHUBHAM'S tHREAD");
		//t.start();
		//System.out.println("main method ");
		
		System.out.println(Thread.currentThread().getName());
	}
}
