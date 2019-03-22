package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import Funciones.Funciones;

class Cadenas {

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
	 * En la prueba 1 veremos que nos devuelva null cuando el valor del array de
	 * palabras enviado sea null.
	 */
	@Test
	@DisplayName("Prueba null.")
	public void pruebaCadena1() {
		String[] cadenaNombres = null;
		assertNull(o.cadenas(cadenaNombres));
	}

	/*
	 * Carlos:
	 * En la prueba 2 veremos que nos devolverá si es un array con contenido vacío,
	 * quiero decir, que está vacío pero no es "null". Ésto nos deberá devolver un
	 * string vacío, es decir, "".
	 */
	@Test
	@DisplayName("Prueba vac\u00eda.")
	public void pruebaCadena2() {
		String[] cadenaNombres = { "", "" };
		assertEquals("", o.cadenas(cadenaNombres));
	}

	/*
	 * Pablo:
	 * En la prueba 3 comprobaremos si letras solas, por separado, las cuenta o no.
	 * Para ello meteremos una vocal minúscula, una consonante minúscula y una letra
	 * mayúscula, ésto solo nos deberá devolver la consonante minúscula. Con ésto
	 * veremos que ignora, efectivamente, las vocales y mayúsculas.
	 */
	@Test
	@DisplayName("Prueba invividual.")
	public void pruebaCadena3() {
		String[] cadenaNombres = { "a", "z", "G" };
		assertEquals("z", o.cadenas(cadenaNombres));
	}

	/*
	 * Carlos:
	 * En la prueba 4 comprobaremos si ignora las vocales y mayúsculas mezcladas,
	 * para ello meteremos por ejemplo 3 palabras (las iniciales las pondré en
	 * mayúscula) y deberá eliminar en mi caso las iniciales y las vocales de cada
	 * palabra.
	 */
	@Test
	@DisplayName("Prueba completa.")
	public void pruebaCadena4() {
		String[] cadenaNombres = { "Grupo", "Carlos", "Pablo" };
		assertEquals("rprlsbl", o.cadenas(cadenaNombres));
	}

}
