package unidad03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Boletin03 {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		double resultado = 0;
		boolean continuar = true;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Se realizará una división con los números introducidos.");
			try {
				System.out.print("Introduce el primer número: ");
				A = scan.nextInt();
				System.out.println("Introduce el segundo número: ");
				B = scan.nextInt();
				resultado = A/B;
				continuar = false;
				System.out.println("El resultado de la división " + A + " entre " + B + " es: " + resultado);
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir un número entero obligatoriamente.");
			} catch (ArithmeticException e) {
				System.out.println("No se puede divir por 0.");
			}
		} while (continuar);
		scan.close();
	}
}
