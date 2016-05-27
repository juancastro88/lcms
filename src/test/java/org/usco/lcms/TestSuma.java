package org.usco.lcms;

import junit.framework.TestCase;

public class TestSuma extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetSuma() {
		//fail("Not yet implemented");
		Suma suma1 = new Suma();
		double resultado = suma1.getSuma(10, 5);
		assertEquals("la suma de 10 + 5 deberia ser 15", 15.0, resultado, 1e-6);
	}

	public void testAumentar() {
		Suma suma1 = new Suma();
		double resultado = suma1.aumentar(14);
		assertEquals("aumentar 14 deberia ser 15", 15.0, resultado);
	}

}
