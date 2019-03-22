package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Funciones.Funciones;

class CadenaNumero {

	static Funciones o = null;

	/*
	 * Antes de cada función haremos un "reseteo" de "o".
	 */
	@BeforeAll
	static void prepararPrueba() {
		o = new Funciones();
	}

	@Test
	@DisplayName("Prueba null.")
	public void pruebaCadena1() {
		String cadenaNombres = null;
		assertEquals(0,o.CadenaNumero(cadenaNombres));
	}
	@Test
	@DisplayName("Prueba vac\u00eda.")
	public void pruebaCadena2() {
		String cadenaNombres = " ";
		assertEquals(0,o.CadenaNumero(cadenaNombres));
	}
	@Test
	@DisplayName("Prueba solo letras.")
	public void pruebaCadena3() {
		String cadenaNombres = "Hola, que tal";
		assertEquals(0,o.CadenaNumero(cadenaNombres));
	}
	
	@Test
	@DisplayName("Prueba de los extremos.")
	public void pruebaCadena4() {
		String cadenaNombres = "0 9";
		assertEquals(9,o.CadenaNumero(cadenaNombres));
	}
	
	@Test
	@DisplayName("Prueba de extremo mas uno y extremo menos uno segun tablas ASCII.")
	public void pruebaCadena5() {
		String cadenaNombres = "/ :";
		assertEquals(0,o.CadenaNumero(cadenaNombres));
	}

	@Test
	@DisplayName("Prueba de nuestros nombres y fecha de nacimiento.")
	public void pruebaCadena6() {
		String cadenaNombres = "Pablo Rodriguez 7-9-2000, Carlos Mesa 16-12-2000";
		assertEquals(30,o.CadenaNumero(cadenaNombres));
	}
}
