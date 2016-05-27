/**
 * demostración
 */
package org.usco.lcms;

/**
 * @author juancastro
 * @version 1.0 27.05.2016
 */
public class Suma {
	private double numero1;
	private double numero2;
	
	public Suma() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numero1
	 * @param numero2
	 */
	public Suma(double numero1, double numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	/**
	 * @return the numero1
	 */
	public double getNumero1() {
		return numero1;
	}

	/**
	 * @param numero1 the numero1 to set
	 */
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	/**
	 * @return the numero2
	 */
	public double getNumero2() {
		return numero2;
	}

	/**
	 * @param numero2 the numero2 to set
	 */
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return double la suma de n1 + n2
	 */
	public double getSuma(double n1, double n2){
		return n1 + n2;
	}
	
	/**
	 * 
	 * @param n1 el numero que desea aumentar
	 * @return double se aumenta en uno el parametro
	 */
	public double aumentar(double n1){
		return n1 + 1;
	}
	
}
