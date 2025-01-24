/**
 * Main
 * 
 * @author Dpto. Informática CPIFP Bajo Aragón
 * @version 1.0, 2023/12/01
 * 
 * Inicio del paquete calculadora.
 * Lanza varias operaciones de una instancia de calculadora
 */

package calculadora;

public class Inicio {

	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		
		System.out.println(cal.suma(5, 3));
		System.out.println(cal.resta(5, 3));
		System.out.println(cal.resta(3, 5));
		System.out.println(cal.restaMayorAlMenor(5, 3));
		System.out.println(cal.restaMayorAlMenor(3, 5));
		System.out.println(cal.dividir(8, 2));
		System.out.println(cal.dividir(9, 2));
		System.out.println(cal.dividir(7, 2));
		//System.out.println(cal.dividir(0, 0));
	}

}