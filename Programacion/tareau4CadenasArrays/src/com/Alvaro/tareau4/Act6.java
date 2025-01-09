package com.Alvaro.tareau4;
import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        rellenarUnidades();
        boolean salir = false;
        Scanner scan = new Scanner(System.in);
        do {
        	System.out.println("""
                    Opciones:
                    1.- Pedir bebida
                    2.- Mostrar bebidas
                    3.- Apagar máquina
                    """);
            System.out.print("Selecciona una opción: ");
            if (!scan.hasNextInt()) {
                System.out.println("Debes introducir un número válido.");
            }
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    pedirBebida(scan);
                    break;
                case 2:
                    mostrarBebidas();
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    salir = true;
                    break;
                default:
                    System.out.println("Debes elegir una opción válida de la máquina.");
                    break;
            }
        } while (!salir);
        scan.close();
    }
    public static void pedirBebida(Scanner scanner) {
        System.out.print("Introduce el código de la bebida (fila y columna): ");
        String codigo = scanner.nextLine().trim();
        if (codigo.length() != 2 || !Character.isDigit(codigo.charAt(0)) || !Character.isDigit(codigo.charAt(1))) {
            System.out.println("Código inválido. Debe ser un número de dos dígitos.");
        }
        int fila = Character.getNumericValue(codigo.charAt(0)) - 1;
        int columna = Character.getNumericValue(codigo.charAt(1)) - 1;
        if (fila < 0 || fila >= productos.length || columna < 0 || columna >= productos[0].length) {
            System.out.println("El código no es válido.");
        }
        // Ver que quedan unidades
        if (unidades[fila][columna] > 0) {
            unidades[fila][columna]--;
            System.out.println("Has pedido: " + productos[fila][columna]);
        } else {
            System.out.println("Lo sentimos, no quedan unidades de esta bebida.");
        }
    }
    public static void mostrarBebidas() {
        StringBuilder disponibles = new StringBuilder("\nBebidas disponibles:\n");
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                if (unidades[i][j] > 0) {
                    disponibles.append("Código ").append(i + 1).append(j + 1).append(": ").append(productos[i][j]).append("\n");
                }
            }
        }
        System.out.println(disponibles);
    }
    public static final Integer[][] unidades = new Integer[4][3];
    public static final String[][] productos = {
        {"Coca-Cola", "Sprite", "Fanta naranja"},
        {"Fanta limón", "Red Bull", "Monster"},
        {"Pepsi", "Schweppes tónica", "Agua mineral"},
        {"Cruzcampo", "Heineken", "Zumo de piña"}
    };
    public static void rellenarUnidades() {
        for (int i = 0; i < unidades.length; i++) {
            for (int j = 0; j < unidades[i].length; j++) {
                unidades[i][j] = 5;
            }
        }
    }
}