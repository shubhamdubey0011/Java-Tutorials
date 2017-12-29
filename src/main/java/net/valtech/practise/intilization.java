package net.valtech.practise;

public class intilization {

	private static String methodOne(String msg) {
		System.out.println(msg);

		return msg;
	}

	public intilization() {

		methodOne("1");
	}

	{
		methodOne("2");
	}
	String m = methodOne("3");

	public static void main(String[] args) {
		Object obj = new intilization();
	}

}
