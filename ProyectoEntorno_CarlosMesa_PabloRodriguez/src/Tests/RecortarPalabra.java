package Tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Funciones.Funciones;

class RecortarPalabra {

	static Funciones o = null;
	static int r, s;

	/*
	 * Antes de cada función haremos un "reseteo" de "o", así como volverán a su
	 * valor inicial la "r" y la "s".
	 */
	@BeforeAll
	static void prepararPrueba() {
		o = new Funciones();
		r = 4;
		s = 7;
	}

	/*
	 * Carlos: En la primera prueba haremos que le llegue un array null y en su caso
	 * nos deberá devolver null.
	 */
	@Test
	@DisplayName("Prueba null.")
	public void pruebaRecortarPalabras1() {
		String[] palabras = null;
		assertNull(o.recortarPalabras(palabras, r, s));
	}

	/*
	 * Pablo: En éste segundo test le pasaremos el array pero, en este caso, vacío.
	 * Lo que nos deberá devolver en el return es un array por lo que pediremos que
	 * nos retorne un listado como "palabras", que esté vacío.
	 */
	@Test
	@DisplayName("Prueba pasando array vacío.")
	public void pruebaRecortarPalabras2() {
		String[] palabras = new String[0];
		assertArrayEquals(palabras, o.recortarPalabras(palabras, r, s));
	}

	/*
	 * Carlos: En el tercer test verificaremos que retorna correctamente todos los
	 * datos según los límites, es decir, en el array meteremos una palabra de
	 * extensión r - 1, una palabra de extensión r, una palabra de extensión s y
	 * otra de extensión s + 1.
	 */
	@Test
	@DisplayName("Prueba pasando array comprobando los extremos.")
	public void pruebaRecortarPalabras3() {
		String[] palabras = { "aaa", "eeee", "iiiiiii", "oooooooo" };
		String[] solucion = { "", "e", "iiii", "oooo" };
		assertArrayEquals(solucion, o.recortarPalabras(palabras, r, s));
	}

}
