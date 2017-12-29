package net.valtech.MultiThreading;

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.print("good morning:");
			try
			{
				Thread.sleep(1000);	
			}
			catch (InterruptedException e)
			{}
			System.out.println(name);
		}
	}
}


class MyThread48 extends Thread
{
	Display d;
	String name;
	
	MyThread48(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}


class SynchronizedDemo
{
	public static void main(String[] args)
	{
		Display d1=new Display();
		MyThread48 t1=new MyThread48(d1,"dhoni");
		MyThread48 t2=new MyThread48(d1,"yuvaraj");
		t1.start();
		t2.start();
	}
}

