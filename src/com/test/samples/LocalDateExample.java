package com.test.samples;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {
		DateTime dateTime = null;
		System.out.println("Local date ::: "+ new LocalDate(dateTime));
		dateTime.toLocalDate();
	}

}
