package unidad04;

import java.util.Scanner;

public class EjCamping {
	static Scanner in;
	public static boolean casoDePrueba() {
		int c = in.nextInt();
		int f = in.nextInt();
		int a = in.nextInt();
		final int ARBOL = 2;
		final int SOMBRA = 1;
		final int SOL = 0;
		// leer un caso de prueba
		if (c == 0 && f == 0 && a == 0) {
			return false;
		} else {
			int [][] camping = new int[c][f];
			for (int i = 0; i < a; i++) {
				camping[in.nextInt() - 1][in.nextInt() - 1] = ARBOL;
			}
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < f; j++) {
					// mirar alrededor del arbol, si es sol pongo un uno que es SOMBRA
					for (int t = i -1; t <= i; t++) {
						
					}
				}
			}
			return true;
		}
	}

}
