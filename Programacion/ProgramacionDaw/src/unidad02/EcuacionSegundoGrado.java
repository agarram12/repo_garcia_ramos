package unidad02;

import java.util.Scanner;
/*
 * Realiza un programa que resuelva una ecuación de segundo grado 
 */
public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Siendo nuestra ecuación ax2 + bx + c = 0");
		System.out.print("Introduce el valor del numero A: ");
		double a = scan.nextDouble();
		System.out.print("Introduce el valor del numero B: ");
		double b = scan.nextDouble();
		System.out.print("Introduce el valor del numero C: ");
		double c = scan.nextDouble();
		scan.close();
		if (a==0) {
			System.err.println("¡El valor *a* no puede ser 0!");
		} else if (b > 4*a*c){
			System.err.println("¡El valor b cuadrado dber ser mayor a 4*a*c!");
		} else {
			double xPositivo = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2 * a);
			double xNegativo = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2 * a);
			System.out.println("El resultado de la x de manera positiva es: " + xPositivo + "\nEl resultado de la x de manera negativa es:  " + xNegativo);
		}
	}

}
