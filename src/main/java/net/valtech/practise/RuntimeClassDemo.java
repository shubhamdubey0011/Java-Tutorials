package net.valtech.practise;

import java.io.IOException;

public class RuntimeClassDemo {

	public static void main(String[] args) throws IOException {

		Runtime rt = Runtime.getRuntime();

		Process p1 = rt.exec("calc");
		Process p2 = rt.exec("mspaint");

		String cmds[] = { "C:/Program Files/Mozilla Firefox/firefox.exe","https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession&cid=0&navigationDirection=forward" };

		Process p3 = rt.exec(cmds);

		System.out.println("Enter to close all the application");

		System.in.read();
		p1.destroy();
		p2.destroy();
		p3.destroy();
		System.out.println("main ends");
	}
}
