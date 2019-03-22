package Tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Funciones.Funciones;

public class alumnosTrabajo {
	static Funciones o = null;
	static int cont=0;
	/*
	 * Antes de cada función haremos un "reseteo" de "o".
	 */
	@BeforeAll
	static void prepararPrueba() {
		o = new Funciones();
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
	 * Carlos:
	 * En la prueba 1 veremos que nos devuelva false cuando el valor del array de
	 * palabras enviado sea falso.
	 */
	@Test
	@DisplayName("Prueba null.")
	public void pruebaCadena1() {
		String[] alumnos =null;
		int[] notasPablo = null;
		int[][] tiemposTrabajos2 = null;
		assertFalse(o.alumnosTrabajo(alumnos,tiemposTrabajos2));
	}

	/*
	 * Carlos:
	 * En la prueba 2 veremos que nos devolverá si es un array con contenido vacío,
	 * quiero decir, que está vacío pero no es "null". Ésto nos deberá devolver un
	 * False.
	 */
	@Test
	@DisplayName("Prueba vac\u00eda.")
	public void pruebaCadena2() {
	String[] alumnos = {""};
	int[] notasPablo = {};
	int[][] tiemposTrabajos2= {};
		assertFalse(o.alumnosTrabajo(alumnos,tiemposTrabajos2));
	}

	/*
	 * Pablo:
	 * Ahora comprobaremos una que de true
	 */
	@Test
	@DisplayName("Prueba True.")
	public void pruebaCadena3() {
		String[] alumnos = new String[1];
		alumnos[0] = "Pablo"; 
		int[] notasPablo = {500,10,40,50,60};
		int[][] tiemposTrabajos2 = new int[1][5];
		tiemposTrabajos2[0] = notasPablo;
		assertTrue( o.alumnosTrabajo(alumnos,tiemposTrabajos2));
	}

	/*
	 * Carlos:
	 * Ahora comprobaremos que es False
	 */
	@Test
	@DisplayName("Prueba False.")
	public void pruebaCadena4() {
		String[] alumnos = new String[1];
		alumnos[0] = "Pablo"; 
		int[] notasPablo = {0,0,0,0,0};
		int[][] tiemposTrabajos2 = new int[1][5];
		tiemposTrabajos2[0] = notasPablo;
		assertFalse( o.alumnosTrabajo(alumnos,tiemposTrabajos2));
	}

}
