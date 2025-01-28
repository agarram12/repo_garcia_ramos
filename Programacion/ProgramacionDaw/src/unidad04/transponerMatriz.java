package unidad04;
import java.util.Scanner;
public class transponerMatriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce los valores de la matriz para obtener la transpuesta:");
		System.out.println("Introduce el número de filas: ");
		int filas = scan.nextInt();
		System.out.println("Introduce el número de columnas: ");
		int cols = scan.nextInt();
		obtenerDimensionMatriz();
		int[][] matriz = new int[filas][cols];
		// inicializar la matriz con los datos
		System.out.println("Matriz inicial");
		obtenerValoresMatriz(matriz);
		System.out.println("Matriz insertada: ");
		mostrarMatriz(matriz);
		int[][] matrizT = obtenerMatrizTraspuesta(matriz);
		System.out.println("\nMatriz traspuesta");
		mostrarMatriz(matrizT);
	}

	private static void obtenerDimensionMatriz() {
		
		
	}

	private static void mostrarMatriz(int[][] matriz) {
		// muestra la matriz tras rellenerla en obtenerMatriz
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
		}
	}

	private static int[][] obtenerMatrizTraspuesta(int[][] matriz) {
		int[][] matrizT = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matrizT.length; i++) {
			for (int j = 0; j < matrizT[0].length; j++) {
				// cambio de indices para poder rellenarla de manera transpuesta. cambiar i j a j i
				matrizT[i][j] = matriz[j][i];
			}
		}
		return matrizT;
	}

	private static void obtenerValoresMatriz(int[][] matriz) {
		// pedir datos al usuario para poder rellenar la matriz con los datos deseados.
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("Introduce un dígito para la posición: ");
				int num = scan.nextInt();
				matriz[i][j] = num;
			}
		}
		scan.close();
	}
}
