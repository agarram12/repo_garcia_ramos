package unidad04;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		float[] temperaturas = new float [12];
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		for (int i = 0; i < meses.length; i++) {
			System.out.printf("Introduce la temperatura media en el mes de: " + meses[i] + " ");
			temperaturas[i] = scan.nextFloat();
		}
		for (int i = 0; i < meses.length; i++) {
			String mes = meses[i];
			if (mes.length()>7) {
				System.out.print(mes+"\t");
			} else {
				System.out.print(mes+"\t\t");
			}
			for (int j = 0; j < temperaturas[i]; j++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}