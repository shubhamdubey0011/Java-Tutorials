package net.valtech.OOPS;

interface Switch {
	void On();

	void Off();
}

class Bulb implements Switch {

	public void On() {
		// TODO Auto-generated method stub
		System.out.println("buld is turned on");
	}

	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("buld is turned off");
	}
}

class Fan implements Switch {

	public void On() {
		// TODO Auto-generated method stub
		System.out.println("Fan is turned on");
	}

	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("Fan is turned off");
	}
}

class MyRoom {
	static Switch myswitch(Character ch) {
		if (ch == 'B') {
			return new Bulb();
		} else {
			return new Fan();
		}
	}
}

public class Abstraction {
	public static void main(String[] args) {

		Switch s1 = MyRoom.myswitch('B');
		s1.On();
		s1.Off();

	}
}
