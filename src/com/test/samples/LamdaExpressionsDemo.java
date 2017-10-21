package com.test.samples;

public class LamdaExpressionsDemo {
	
	public static void main(String[] args) {
		LamdaInterface lamdaInterface = (name) -> System.out.println(name);
		lamdaInterface.printName("Rajeev");
	}
	
	interface LamdaInterface {
		void printName(String name);
	}

}
