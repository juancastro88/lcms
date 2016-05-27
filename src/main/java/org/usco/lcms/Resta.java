/**
 * 
 */
package org.usco.lcms;

/**
 * Esta clase implementa las funcionalidades de la resta.
 * @author juancastro
 * @version 1.0 27.05.2016
 */
public class Resta {
	/**
	 * Este metodo permite restar dos numeros.
	 * @param numero1 el numero1 es el sustraendo
	 * @param numero2 el numero2 es el minuendo
	 * @return retorna el resultado de la resta
	 */
	public double getResta(double numero1, double numero2){
		return numero1 - numero2;
	}
	/**
	 * Este metodo disminuye el parametro ingresado en 1
	 * @param numero1 el numero a disminuir
	 * @return el numero disminuido en 1
	 */
	public double disminuir(double numero1){
		return numero1 - 1;
	}	
}
