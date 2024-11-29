
// 1. Crearemos un programa que vaya pidiendo números enteros en
// el momento que detecta un número no entero, nos muestre una
// excepción try...catch y nos lo vuelva a pedir.

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        while (true) {
            try {
                System.out.print("\nIntroduce un número entero: ");
                numero = Integer.parseInt(scanner.nextLine());
                System.out.println(numero+" es entero.");
            } catch (NumberFormatException e) {
                System.out.println("El número no es entero. Inténtalo de nuevo.");
            }
        }
    }
}


