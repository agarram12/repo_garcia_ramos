package unidad04;
	import java.util.*;

	public class EjPollosCorral {

	  static Scanner in;

	  public static void casoDePrueba() {
		  int filas = in.nextInt();
		  int cols = in.nextInt();
		  int corral[][] = new int[filas][cols];
		  int pollitos = in.nextInt();
		  for (int i = 0; i < pollitos; i++) {
			String comportamientoPollito = in.nextLine();
			String[] datosPollito = comportamientoPollito.split(" ");
			int fila = Integer.parseInt(datosPollito[0]) -1;
			int col = Integer.parseInt(datosPollito[1]) -1;
			String direccion = datosPollito[2];
			int pasos = Integer.parseInt(datosPollito[3]);
			while (pasos > 0) {
				corral[fila][col] = corral[fila][col] +1;
				switch (direccion) {
				case "N":
					while (pasos>  0 && !chocado()) {
						corral[s][j] = corral[i][j] +1;
						s = s-factor;
						corral[i][j] = corral[i][j] +1;
						t = t+factor;
						pasos--;
						factor = -(factor + 1);
					}
					break;
				case value:
					
					break;
				case value:
					
					break;
				case value:
					
					break;

				default:
					break;
				}
				pasos--;
			}
		}
	    // TU CÓDIGO AQUÍ.
	    // Procesa un único caso leyendo con
	    // in.next*()

	  } // casoDePrueba

	  public static void main(String[] args) {

	    in = new java.util.Scanner(System.in);

	    int numCasos = in.nextInt();
	    for (int i = 0; i < numCasos; i++)
	      casoDePrueba();

	  } // main

} // class Solution
