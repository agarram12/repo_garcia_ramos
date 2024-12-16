package unidad04;

public class Ej11 {

	public static void main(String[] args) {
		int[][] num = new int[4][5];
		int sumaFila = 0;
		int sumaColum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				int numAleatorio = (int) (Math.random()*10);
				num[i][j] = numAleatorio;
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.print(num[i][j] + "\t");
				sumaFila += num[i][j];
				if (j == 0) {
					sumaColum += num[i][j];
				}
			}
			System.out.print(sumaFila + "\n");
			sumaFila = 0;
			sumaColum = 0;
		}
	}
}