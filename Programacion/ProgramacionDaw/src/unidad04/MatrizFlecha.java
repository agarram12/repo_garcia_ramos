package unidad04;

import java.util.Scanner;

public class MatrizFlecha {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Introduce el tamaño de la matriz: ");
		int n = scan.nextInt();
		int[][] matriz = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Introduce el siguiente número de la matriz: ");
				matriz[i][j] = scan.nextInt();
			}
		}
		System.out.println("Matriz: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.print("\n");
		}
		if (esTipoFlecha(matriz, n)) {
			System.out.println("La matriz es de tipo flecha");
		} else {
			System.out.println("La matriz no es de tipo flecha");
		}
	}
	
	public static boolean esTipoFlecha(int[][] matriz, int n) {
		int sumaAnterior = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int sumaDiagonal = 0;
			for (int j = 0; j <= i; j++) {
				sumaDiagonal += matriz[j][i - j];
			}
			if (sumaDiagonal <= sumaAnterior) {
				return false;
			}
			sumaAnterior = sumaDiagonal;
		}
		return true;
	}
}