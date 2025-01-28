package unidad04;

import java.util.Scanner;

public class Pangrama1 {
	public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una frase para saber si es Pangrama: ");
        String input = scan.nextLine();
        try {
            if (!input.matches("[a-zA-Zñáéíóúü ,.]+")) {
                throw new Exception("Debes introducir solo letras del abecedario Español.");
            }
            String cadena = input.toLowerCase().replaceAll("[^a-zñáéíóúü]", "");
            String abecedario = "abcdefghijklmnopqrstuvwxyz";
            String letrasFaltan = "";
            boolean esPangrama = true;
            for (int i = 0; i < abecedario.length(); i++) {
                if (!cadena.contains(String.valueOf(abecedario.charAt(i)))) {
                    esPangrama = false;
                    letrasFaltan += abecedario.charAt(i) + " ";
                }
            }
            if (esPangrama) {
//El veloz murciélago hindú comía feliz cardillo y kiwi. La cigüeña tocaba el saxofón detrás del palenque de paja.
                System.out.println("Es un pangrama.");
            } else {
                System.out.println("No es pangrama. Para serlo, necesitabas las siguientes letras: " + letrasFaltan);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}