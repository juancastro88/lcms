package org.usco.lcms;

import junit.framework.TestCase;

public class TestResta extends TestCase {
	Resta resta;
	
	//ocurre antes
	protected void setUp() throws Exception {
		System.out.println("Estoy en el setUp()");
		super.setUp();
		resta = new Resta();
	}
	//ocurre despues
	protected void tearDown() throws Exception {
		System.out.println("Estoy en el tearDown()");
		super.tearDown();
	}
	public void testGetResta() {
		//fail("Not yet implemented");
		double resultado = resta.getResta(10, 5);
		assertEquals("la resta de 10 - 5 deberia ser 5", 5.0, resultado, 1e-6);	
	}
	public void testDisminuir() {
		//fail("Not yet implemented");
		double resultado = resta.disminuir(10);
		assertEquals("disminuir 10 deberia ser 9", 9.0, resultado, 1e-6);	
	}

}
