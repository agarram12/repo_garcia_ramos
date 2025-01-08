package com.Alvaro.tareau4;

import java.util.Random;
import java.util.Scanner;

public class Act3 {

	public static void main(String[] args) {
		String[] alimentos = {"zanahoria","mandarina","limón","aguacate","patata","espinaca","fresa","mango","manzana","coliflor"};
		boolean salir = false;
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("""
					------------Opciones-------------
					| 1.- Jugar						
					| 2.- Finalizar el juego		
					---------------------------------
					""");
			System.out.println("Elige una opción del menú: ");
			int input = scan.nextInt();
			switch (input) {
			case 1:
				jugar(alimentos, scan, random);
				break;
			case 2:
				System.out.println("Finalizando el juego, gracias.");
				salir = true;
				break;

			default:
				System.err.println("Elige una opción del menú.");
				break;
			}
			
		} while (!salir);
		scan.close();
	}
	public static void jugar(String[] palabras, Scanner scanner, Random random) {
		// programa para el juego
		Scanner scan = new Scanner(System.in);
		String palabra = palabras[random.nextInt(palabras.length)];
		char[] guiones = new char[palabra.length()];
	        for (int i = 0; i < guiones.length; i++) {
	        	guiones[i] = '_';
	        }
        int intentosRestantes = 5;
        boolean adivinando = true;
        while (adivinando && intentosRestantes > 0) {
            System.out.println("\nPalabra: " + String.valueOf(guiones));
            System.out.println("Intentos restantes: " + intentosRestantes);
            // mostrar menú
        System.out.print("""
        	Opciones
			| L.- Probar letra						
			| R.- Resolver palabra
			| S.- Salir		
			---------------------------------
        		""");
        System.out.println("Elige una opción: ");
        String subOpcion = scan.nextLine().toUpperCase();
        switch (subOpcion) {
		case "L":
			System.out.print("Introduce una letra: ");
		    String inputLetra = scanner.nextLine().trim();  
		    if (inputLetra.isEmpty()) {
		        System.out.println("No has ingresado ninguna letra. Intenta de nuevo.");
		        break;
		    }
		    if (inputLetra.length() > 1) {
		        System.out.println("Solo puedes ingresar una letra. Intenta de nuevo.");
		        break;
		    }
		    char letra = inputLetra.charAt(0);
		    if (probarLetra(palabra, guiones, letra)) {
		        System.out.println("La letra es correcta");
		        if (String.valueOf(guiones).equals(palabra)) {
		            System.out.println("¡Has acertado la palabra! era: " + palabra);
		            adivinando = false;
		        }
		    } else {
		        System.out.println("Letra incorrecta.");
		        intentosRestantes--;
		    }
			break;
		case "R":
			 System.out.print("Introduce tu respuesta: ");
             String respuesta = scanner.nextLine().toLowerCase();
             if (respuesta.equals(palabra)) {
                 System.out.println("¡Has acertado! La palabra era: " + palabra);
                 adivinando = false;
             } else {
                 System.out.println("Palabra incorrecta.");
                 intentosRestantes--;
             }
			break;
		case "S":
			System.out.println("Terminando la partida");
            adivinando = false;
			break;
		default:
			System.err.println("Elige una opción del menú");
			break;
		}
    }
}
    public static boolean probarLetra(String palabra, char[] guiones,char letra) {
    	// comprobar letras y guiones
    	 boolean acierto = false;
         for (int i = 0; i < palabra.length(); i++) {
             if (palabra.charAt(i) == letra && guiones[i] == '_') {
                 guiones[i] = letra;
                 acierto = true;
             }
         }
         return acierto;
    }
}
