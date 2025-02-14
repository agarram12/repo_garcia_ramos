package unidad05;

import java.util.Scanner;

public class TestVehiculos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bicicleta bici = new Bicicleta("Orbea", "oiz", "verde");
		Coche turismo = new Coche("Seat", "Ibiza", "Blanco", 2002);
		int opc = 0;
		do {
			System.out.print("""
					VEHÍCULOS
					=========
					1. Anda con la bicicleta
					2. Haz el caballito con la bicicleta
					3. Anda con el coche
					4. Quema rueda con el coche
					5. Ver kilometraje de la bicicleta
					6. Ver kilometraje del coche
					7. Ver kilometraje total
					8. Salir
					Elige una opción (1-8):
					""");
			opc = scan.nextInt();
			switch (opc) {
			case 1:
				System.out.println("¿Qué distancia andas con la bicicleta?");
				bici.andar(scan.nextDouble());
				break;
			case 2:
				bici.hacerCaballito();
				System.out.println("¿Durante qué distancia haces el caballito?");
				bici.andar(scan.nextDouble());
				break;
			case 3:
				System.out.println("¿Qué distancia andas con el coche?");
				turismo.andar(scan.nextDouble());
				break;
			case 4:
				turismo.quemarRueda();
				break;
			case 5:
				System.out.printf("Has recorrido %.2f kilómetros con la bicicleta %s\n", bici.getKilometrosRecorridos(),
						bici);
				break;
			case 6:
				System.out.printf("Has recorrido %.2f kilómetros con el %s\n", turismo.getKilometrosRecorridos(),
						turismo);
				break;

			default:
				break;
			}
		} while (opc != 8);
		scan.close();
	}

}