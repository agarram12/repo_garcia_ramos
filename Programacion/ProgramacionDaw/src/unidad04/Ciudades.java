package unidad04;

import java.util.Scanner;

public class Ciudades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce las ciudades: ");
		String input = scan.nextLine();
		char[] vocales = {'a','e','i','o','u','á','é','í','ú','A','E','I','O','U','Á','É','Í','Ó','Ú'};
		int n_vocales = 0;
		String[] ciudades = input.toLowerCase().split(",");
		String vocalesCiudad = "";
		System.out.println("\nCiudades con las mismas vocales: ");
		
	}

}