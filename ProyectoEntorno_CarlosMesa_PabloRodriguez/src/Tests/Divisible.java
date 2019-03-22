package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import Funciones.Funciones;

class Divisible {

	static Funciones o = null;
	static int x;
	static int cont=0;

	/*
	 * Antes de cada test se reseteará "o" y "x", la cual debemos meter siempre y
	 * debemos dejarle un valor fijo, en el caso del grupo C, el 7. Se le hará
	 * un @BeforeAll por si en la función que se ejecuta cambia de valor, con ésto
	 * siempre al empezar cada test "x" valdrá 7.
	 */
	@BeforeAll
	static void prepararTests() {

		o = new Funciones();
		x = 7;

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
	 * En esta prueba 1 deberemos intentar que entre en el if, es decir, sabiendo
	 * que nuestro número es el 7, deberemos intentar coger un numero que sea
	 * divisible entre 7.
	 */
	@Test
	@DisplayName("Prueba que devuelve true.")
	public void pruebaDivisible1() {
		assertTrue(o.divisible(x, 14));
	}

	/*
	 * Pablo:
	 * En esta prueba 2 haremos que no entre en el if, es decir, que vaya al else.
	 * Con ésta segunda prueba ya habremos visto las dos partes en las que pueden
	 * entrar los datos.
	 */
	@Test
	@DisplayName("Prueba que devuelve false.")
	public void pruebaDivisible2() {
		assertFalse(o.divisible(x, 34));
	}

}
