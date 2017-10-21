package com.test.samples;

public class ExceptionSample {
	public static void main(String args[]) {
		try {
			if(true)
				throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("catching the exception");
			throw e;
		}
		System.out.println("after exception");
	}
}
