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
		  }
}
	  public static void main(String[] args) {

	    in = new java.util.Scanner(System.in);

	    int numCasos = in.nextInt();
	    for (int i = 0; i < numCasos; i++)
	      casoDePrueba();

	  } // main

} // class Solution
