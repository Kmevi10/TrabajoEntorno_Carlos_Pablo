package Funciones;

import java.util.*;

public class Funciones {
	
	public Funciones() {}
	
	public static boolean divisible(int x, int numero) {
		
		if (numero % x == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

	public static boolean intervalos(int n, int numero) {
		
		if (numero >= n - 50 && numero <= n + 50) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

	public static int dividir(int numero, int x, int y, int intervalo) {
		
		boolean entra = divisible(x, numero);
		if(entra) {
			
			entra = intervalos(y, numero);
			if (entra) {
				
				entra = divisible(numero, intervalo);
				if (entra) {
					
					return numero / intervalo;
					
				} else {
					
					return 0;
					
				}
				
			} else {
				
				return 0;
				
			}
			
		} else {
			
			return 0;
			
		}
		
	}

	public static String cadenas(String[] cadenaNombres) {
		
		if (cadenaNombres == null) {
			
			return null;
			
		} else {
			
			String todo = "";
			String devolver = "";
			for (int i = 0; i < cadenaNombres.length; i++) {
				
				todo += cadenaNombres[i];
				
			}
			for (int i = 0; i < todo.length(); i++) {
				
				if ((todo.charAt(i) != ' ' && todo.charAt(i) != 'a' && todo.charAt(i) != 'e' && todo.charAt(i) != 'i' && todo.charAt(i) != 'o' && todo.charAt(i) != 'u') && (todo.charAt(i) > 'Z' || todo.charAt(i) < 'A')) {
					
					String letra = Character.toString(todo.charAt(i));
					devolver += letra;
						
				}
				
			}
			
			return devolver;
			
		}
		
	}

	public static void ejercicio5() {
		
	}
	
	public static double multiplicacionesYPonencias(double[] numeros){

		if (numeros == null) {
			
			for (int i = 0; i < numeros.length; i++) {
				
				
				
			}
			
		}
		return 0;
		
	}
	
}
