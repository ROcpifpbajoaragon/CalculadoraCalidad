package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;


class TestCalculadora {

	Calculadora cal = new Calculadora();
	
	@DisplayName("Prueba Sumar")
	@Test
	void testSumar() {
		assertTrue (8 == cal.suma(5, 3));
		assertFalse (9 == cal.suma(5, 3));
	}
	
	
	@Test
	void testRestar() {
		assertTrue (4 == cal.resta(10, 5));
		assertEquals(5, cal.resta(10,5));
		assertNotEquals(4, cal.resta(10,5));
	}

}
