package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.*;

import Funciones.Funciones;
import junit.framework.Assert;

class MultiplicacionesYPotencias {

	static Funciones o = null;
	static int z, w;

	/*
	 * Antes de cada función haremos un "reseteo" de "o", así como volverán a su
	 * valor inicial la "z" y la "w".
	 */
	@BeforeAll
	static void prepararPrueba() {
		o = new Funciones();
		z = 4;
		w = 4;
	}

	/*
	 * Carlos: En la primera prueba haremos que le llegue un array null y en su caso
	 * nos deberá devolver null.
	 */
	@Test
	@DisplayName("Prueba null.")
	public void pruebaMultiplicacionesYPotencias1() {
		double[] numeros = null;
		assertNull(o.multiplicacionesYPonencias(numeros, z, w));
	}

	/*
	 * Pablo: En éste segundo test le pasaremos el array pero, en este caso, vacío.
	 * Lo que nos deberá devolver en el return es un array por lo que pediremos que
	 * nos retorne un listado como "numeros", que está vacío.
	 */
	@Test
	@DisplayName("Prueba pasando array vacío.")
	public void pruebaMultiplicacionesYPotencias2() {
		double[] numeros = new double[0];
		assertArrayEquals(numeros, o.multiplicacionesYPonencias(numeros, z, w));
	}

	/*
	 * Carlos: En el tercer test verificaremos que retorna correctamente todos los
	 * datos según su posición. Para ello le meteremos un listado double y le
	 * pediremos que nos devuelva las soluciones que ya sabemos, lo resumiré con las
	 * dos primeras poisiciones: si la posición es 0 (numeros[0]), el numero es par
	 * y entonces se multiplica por 4 (1.5 * 4 = 6) y guardaremos ese valor en un
	 * array que creemos para pedir que nos devuelva uno como ese, en la posición
	 * cerrespondiente (0 en este caso). Si la posición es impar como el 1
	 * (numeros[1]) lo elevaremos el número 4 veces (2 ^ 4 = 16) y lo guardaremos
	 * como indiqué anteriormente.
	 */
	@Test
	@DisplayName("Prueba pasando array lleno.")
	public void pruebaMultiplicacionesYPotencias3() {
		double[] numeros={ 1.5, 2, 5.2, 6 };
		double[] solucion = { 6.0, 16.0, 20.8, 1296.0 };
		assertArrayEquals(solucion, o.multiplicacionesYPonencias(numeros, z, w));
	}

}
