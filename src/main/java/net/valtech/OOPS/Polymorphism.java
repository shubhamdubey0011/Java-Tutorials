//changging the objects behaviour in differrnt stages of application developemnet is c/A polymorphism
package net.valtech.OOPS;

interface webDriver {
	void getTitile();
}

class FirfoxDriver implements webDriver {

	public void getTitile() {
		System.out.println("get title from firefox class");

	}

}

class GoogleChromeDriver implements webDriver {
	public void getTitile() {
		System.out.println("get title from googlechrome class");

	}

}

class Myclass {
	static void demo(webDriver driver) {
		driver.getTitile();

	}
}

class Polymorphism {
	public static void main(String[] args) {
		Myclass.demo(new FirfoxDriver());
		Myclass.demo(new GoogleChromeDriver());
	}
}
