package com.qa.javabeginner.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TemperatureTest {
	public static TemperatureConverter tempConverter;
	
	@BeforeAll
	public static void init() {
		System.out.println("START");
		System.out.println("========================================");
		
	}
	
	@BeforeEach
	public void beforeEach() {
		tempConverter = new TemperatureConverter();
	}
	
	@Test
	public void test_Construction() {
		tempConverter = new TemperatureConverter();
		
		assertTrue(tempConverter instanceof TemperatureConverter);
		
	}
	
	@Test
	public void convertFarenheitToCelciusTest() {
		assertEquals(10f, tempConverter.convertFahrenheitToCelsius(50));
	}
}
