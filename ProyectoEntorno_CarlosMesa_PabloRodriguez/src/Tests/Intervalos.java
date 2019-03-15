package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import Funciones.Funciones;

class Intervalos {

	static Funciones o = null;
	static int y;

	/*
	 * Antes de cada test se reseteará "o" e "y", la cual debemos meter siempre y
	 * debemos dejarle un valor fijo, en el caso del grupo C, el 250. Se le hará
	 * un @BeforeAll por si en la función que se ejecuta cambia de valor, con ésto
	 * siempre al empezar cada test "y" valdrá 250.
	 */
	@BeforeAll
	static void prepararTests() {

		o = new Funciones();
		y = 250;

	}

	/*
	 * En realizar los siguientes test vamos a tener que probar los valores límites,
	 * es decir, si en nuestro caso tenemos y = 250 y debemos observar los números
	 * en el intervalo de 200 y 300 ("y - 50" e "y + 50") deberemos realizar pruebas
	 * con 199, 200, 300 y 301.
	 */
	/*
	 * Carlos:
	 * La primera prueba será la del mínimo menos 1, es decir, 200 - 1. Nos deberá
	 * salir False ya que está fuera del intervalo entre 200 y 300.
	 */
	@Test
	@DisplayName("Prueba m\u00ednimo - 1.")
	public void pruebaIntervalo1() {
		assertFalse(o.intervalos(y, y - 51));
	}

	/*
	 * Pablo:
	 * La seguda prueba se hará para ver el límite mínimo dentro del intervalo que
	 * vale, es decir, 200. Nos deverá devolver True.
	 */
	@Test
	@DisplayName("Prueba m\u00ednimo.")
	public void pruebaIntervalo2() {
		assertTrue(o.intervalos(y, y - 50));
	}
	
	/*
	 * Carlos:
	 * La tercera prueba se hará para ver el límite máximo dentro del intervalo que
	 * vale, es decir, 300. Nos deberá devolver True.
	 */
	@Test
	@DisplayName("Prueba m\u00e1ximo.")
	public void pruebaIntervalo3() {
		assertTrue(o.intervalos(y, y + 50));
	}
	
	/*
	 * Pablo:
	 * La cuarta prueba será la del máximo más 1, es decir, 300 + 1. Nos deberá
	 * salir False ya que está fuera del intervalo entre 200 y 300.
	 */
	@Test
	@DisplayName("Prueba m\u00e1ximo + 1.")
	public void pruebaIntervalo4() {
		assertFalse(o.intervalos(y, y + 51));
	}

}
