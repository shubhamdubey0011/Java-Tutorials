package net.valtech.MultiThreading;

class MyThread45 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Seethe Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e){}
		}
	}
}



class ThreadDemo3 
{

	public static void main(String[] args)throws InterruptedException
	{
		MyThread45 t=new MyThread45();
		t.start();
		t.join();	      //1
		for(int i=0;i<5;i++)
		{
			System.out.println("Rama Thread");
		}
	}

}
