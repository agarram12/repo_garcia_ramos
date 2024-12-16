package unidad04;

public class Ej03 {

	public static void main(String[] args) {
//		int numAleatorio = (int) (Math.random()* 3);
//		System.out.println(numAleatorio);	
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		for (int i = 0; i < numero.length; i++) {
			numero [i] = (int) (Math.random()* 101);
			cuadrado [i] = (int) Math.pow(numero[i], 2);
			cubo [i] = (int) Math.pow(numero [i], 3);	
			System.out.printf("%d\t%d\t%d\t\n", numero[i], cuadrado[i], cubo[i]);
		}
	}

}
