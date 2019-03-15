package Main;

import Funciones.Funciones;

public class Main {

	public static void main(String[] args) {

		int[] numeros = {7, 250, 4, 4, 4, 7, 500};
		String[] cadenaNombres = null;
		Funciones o = new Funciones();
		boolean solucion = o.divisible(numeros[0], 22);
		System.out.println(solucion);

	}

}
