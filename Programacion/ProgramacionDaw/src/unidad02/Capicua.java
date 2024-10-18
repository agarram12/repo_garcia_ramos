package unidad02;

import java.util.Iterator;
import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número para ver si es capicua: ");
		long num = scan.nextLong();
		long numActual = num;
		int numCifras = 1;
		while (numActual/10 != 0) {
			numCifras++;
			numActual = numActual/10;
		}
		for (int i = 0; i < numCifras / 2; i++) {
			double numDivision = Math.pow(10,numCifras -i -1);
			double numModulo = Math.pow(10, 1);
			double numDelante = (num/numDivision)%10;
			double numDetras = (num/numModulo)%10;
		}
	}
}