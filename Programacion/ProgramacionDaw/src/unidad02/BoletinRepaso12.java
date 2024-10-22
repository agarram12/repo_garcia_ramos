package unidad02;
import java.util.Scanner;

public class BoletinRepaso12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número de como máximo 5 cifras para saber cuantos dígitos tiene: ");
		int numero = scan.nextInt();
		int contador = 0;
		if (numero < 99999 && numero > -99999) {
			while (numero != 0) {
				numero /= 10;
				contador++;
			}
			System.out.println("En total tiene " + contador + " cifras");
		}

	}

}
