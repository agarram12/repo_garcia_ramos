package com.Alvaro.tarea2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;
		boolean correcto = true;
		do {
			System.out.print("----------| CALCULADORA |--------------- \n1-Suma \n2-Resta \n3-Multiplicación \n4-División \n5-Raíz cuadrada \n6-Potencia \n0 Salir \n----------------------------------\n");
			System.out.print("Introduce una opción: ");
			int opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Has elegido realizar una suma.");
				System.out.print("introduce el primer número: ");
				num1 = scan.nextDouble();
				System.out.print("introduce el segundo número: ");
				num2 = scan.nextDouble();
				resultado = num1+num2;
				System.out.println("El resultado de la suma es: " + resultado);
				break;
			case 2:
				System.out.println("Has elegido realizar una resta.");
				System.out.print("introduce el primer número: ");
				num1 = scan.nextDouble();
				System.out.print("introduce el segundo número: ");
				num2 = scan.nextDouble();
				resultado = num1-num2;
				System.out.println("El resultado de la resta es: " + resultado);
				break;
			case 3:
				System.out.println("Has elegido realizar una multiplicación.");
				System.out.print("introduce el primer número: ");
				num1 = scan.nextDouble();
				System.out.println("introduce el segundo número: ");
				num2 = scan.nextDouble();
				resultado = num1*num2;
				System.out.println("El resultado de la multiplicación es: " + resultado);
				break;
			case 4:
				System.out.println("Has elegido realizar una división.");
				System.out.print("introduce el primer número: ");
				num1 = scan.nextDouble();
				System.out.print("introduce el segundo número: ");
				num2 = scan.nextDouble();
				if (num2 <= 0) {
					System.err.println("¡Introduce un numero distinto de 0!");
				} else {
					resultado = num1/num2;
					System.out.println("El resultado de la suma es: " + resultado);
				}
				break;
			case 5:
				System.out.println("Has elegido realizar una raíz cuadrada de un número.");
				System.out.print("introduce el número: ");
				num1 = scan.nextDouble();
				resultado = Math.sqrt(num1);
				System.out.println("El resultado de la multiplicación es: " + resultado);
				break;
			case 6:
				System.out.println("Has elegido realizar una potencia de un número.");
				System.out.print("introduce el número para hacer la potencia: ");
				num1 = scan.nextDouble();
				System.out.print("introduce la potencia: ");
				int potencia = scan.nextInt();
				resultado = Math.pow(num1 , potencia);
				System.out.println("El resultado de la multiplicación es: " + resultado);
				break;
			case 0:
				System.out.println("Saliendo del programa");
				String salida = scan.nextLine();
				if (salida.equals("")) {
					System.out.println("Presiona \"ENTER\" para salir del menú");
					String confirmar = scan.nextLine();
					if (confirmar.equals("")) {
						System.out.println("¡Hasta luego!");
						break;
					}
				}
			default:
				System.err.println("¡Elige una opción del menú!");
				correcto = false;
				break;
			}
		} while (!correcto);
		
	}

}