package unidad02;
import java.util.Scanner;

public class ReglaDeTresDos {
	public static void main(String[] args) {
		// Solucion regla de tres (b*c)/a
		Scanner scan = new Scanner(System.in);
		System.out.println("Resolver una regla de tres.");
		System.out.print("Introduce el digito A: ");
		double A = scan.nextDouble();
		System.out.print("Introduce el digito B: ");
		double B = scan.nextDouble();
		System.out.print("Introduce el digito C: ");
		double C = scan.nextDouble();
		if (A != 0) {
		double resultado = (B*C)/A;
		System.out.println("La solución de la regla de 3 es: ");
		System.out.print(A);
		System.out.print(" ---> ");
		System.out.println(B);
		System.out.print(C);
		System.out.print(" ---> ");
		System.out.print(resultado);
		} else {
			System.out.println("La regla de 3 introducida no tiene solución, \nEl parametro A no puede ser 0");
		}
		scan.close();
	}
}