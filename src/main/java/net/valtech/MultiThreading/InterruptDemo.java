package net.valtech.MultiThreading;

class MyThread46 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("i am lazy Thread :"+i);
				Thread.sleep(2000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("i got interrupted");
		}
	}
}


public class InterruptDemo
{

	public static void main(String[] args)
	{
		MyThread46 t=new MyThread46();
		t.start();
		t.interrupt();		         //1
		System.out.println("end of main thread");
	}

}
