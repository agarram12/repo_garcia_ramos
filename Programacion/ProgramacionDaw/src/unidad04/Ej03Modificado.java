package unidad04;

public class Ej03Modificado {

	public static void main(String[] args) {
		int [][] arrayBidimensional = new int[4][4];
		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional.length; j++) {
				int numAleatorio = (int) (Math.random()*101);
				arrayBidimensional[i][j] = numAleatorio;
			}
		}
		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional.length; j++) {
				System.out.print(arrayBidimensional[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

}
