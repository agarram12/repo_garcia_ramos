import java.util.Scanner;

public class ReglaDeTres {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Resolver una regla de tres.");
		System.out.print("Introduce el digito A: ");
		float A = scan.nextFloat();
		System.out.print("Introduce el digito B: ");
		float B = scan.nextFloat();
		System.out.print("Introduce el digito C: ");
		float C = scan.nextFloat();
		float resultado = (B*C)/A;
		System.out.println("El resultado de x es: " + resultado);
		scan.close();
	}
}
