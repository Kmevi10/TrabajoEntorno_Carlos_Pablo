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

	public static int CadenaNumero(String cadena) {
		
		int suma=0;
		
		if(cadena==null) {
			
			return suma;
			
		}
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i)>=48 && cadena.charAt(i)<=57) {
				
				suma +=cadena.charAt(i)-48;
			}
		}
		return suma;
	}
	
	public static double[] multiplicacionesYPonencias(double[] numeros, int z, int w) {

		if (numeros != null) {

			double[] solucion = new double[numeros.length];
			double[] vacio = new double[0];
			if (Arrays.toString(solucion) != Arrays.toString(vacio)) {

				for (int i = 0; i < numeros.length; i++) {
					
					if (i % 2 == 0) {
						
						solucion[i] = numeros[i] * z;
						
					} else {
						
						double control = numeros[i];
						for (int j = 0; j < w - 1; j++) {
							
							numeros[i] *= control;
							
						}
						solucion[i] = numeros[i];
						
					}

				}
				
				return solucion;
				
			} else {
				
				return solucion;
				
			}

		} else {
			
			return null;
			
		}

	}

	
public static String[] recortarPalabras(String[] palabras, int r, int s) {
		
		if (palabras != null) {
			
			String[] solucion = new String[palabras.length];
			String control = "";
			for (int i = 0; i < palabras.length; i++) {
			
				for (int j = r - 1; j < s && j < palabras[i].length(); j++) {
				
					control += Character.toString(palabras[i].charAt(j));
				
				}
				
				solucion[i] = control;
				control = "";
			
			}
			return solucion;
			
		} else {
			
			return null;
			
		}
		
	}


	
	public Boolean alumnosTrabajo(String[] nombres, int[][] tiempoTrabajos) {
		boolean respuesta=false;
		if(nombres==null || tiempoTrabajos==null) {
		return false;	
		}
			for(int i = 0; i < tiempoTrabajos.length; i++) {
				int total = 0;
				for(int j = 0; j < tiempoTrabajos[i].length; j++) {
					int num1 = tiempoTrabajos[i][j];
					total = total + num1;
				}
				if(total >=500) {
					respuesta=true;
				}
			}
			return respuesta;
		}
}
