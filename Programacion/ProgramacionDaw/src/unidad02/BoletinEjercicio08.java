package unidad02;
import java.util.Scanner;
/*
 * Escribe un programa que ordene tres números enteros introducidos por
	teclado
 */
public class BoletinEjercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Se va a ordenar tres número enteros");
		System.out.println("Introduce el número 1: ");
		int num1 = scan.nextInt();
		System.out.println("Introduce el número 2: ");
		int num2 = scan.nextInt();
		System.out.println("Introduce el número 3: ");
		int num3 = scan.nextInt();
		scan.close();
		int mayor;
		if (num1 > num2) {
			mayor = num1;
			if (mayor < num3) {
				mayor = num3;
			}
		} else {
			mayor = num2;
			if (mayor < num3) {
				mayor = num3;
			}
		}
	}
}