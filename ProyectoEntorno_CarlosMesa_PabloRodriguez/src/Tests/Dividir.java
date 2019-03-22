package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Funciones.Funciones;

public class Dividir {
	static Funciones o = null;
	static int cont=0;
	static int x;
	static int y;
	/*
	 * Antes de cada función haremos un "reseteo" de "o".
	 */
	@BeforeAll
	static void prepararPrueba() {
		o = new Funciones();
		x=7;
		y=250;
	}

	@AfterAll
	static void finalizarTest() {
	Funciones o = null;
	}
	@AfterEach
	void contador() {
		cont++;
		System.out.println("Esta es la prueba numero : "+cont);
	}
	/*
	 * Esta prueba es de caja blanca entrando en el primer if
	 */
	@Test
	@DisplayName("Prueba entra solo en el primer git.")
	public void pruebaCadena1() {
		int dividir = 14;
		assertEquals(0,o.dividir(dividir,x,y,y));
	}
	/*
	 * Esta prueba es de caja blanca entrando en el segundo if
	 */
	@Test
	@DisplayName("Prueba entra en el segundo if.")
	public void pruebaCadena2() {
		int dividir = 238;
		assertEquals(0,o.dividir(dividir,x,y,y));
	}
	/*
	 * Esta prueba es de caja blanca entrando en el tercer if
	 */
	@Test
	@DisplayName("Prueba entra en el tercer if.")
	public void pruebaCadena3() {
		int dividir = 238;
		assertEquals(1,o.dividir(dividir,x,y,238));
	}
	/*
	 * Esta prueba es de caja blanca  no entrando en ningun if
	 */
	@Test
	@DisplayName("No entra en ningun if.")
	public void pruebaCadena4() {
		int dividir = 2;
		assertEquals(0,o.dividir(dividir,x,y,y));
	}
	/*
	 * Esta prueba es de caja negra probando el valor minimo
	 */
	@Test
	@DisplayName("Prueba extremo minimo")
	public void pruebaCadena5() {
		int dividir = Integer.MAX_VALUE;
		assertEquals(0,o.dividir(dividir,x,y,y));
	}
	/*
	 * Esta prueba es de caja negra probando el valor maximo
	 */
	@Test
	@DisplayName("Prueba extremo maximo")
	public void pruebaCadena6() {
		int dividir = Integer.MIN_VALUE;
		assertEquals(0,o.dividir(dividir,x,y,y));
	}
}


