
// 1. Programa ajedrez alfil (arrays bidimensionales)

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la posición del alfil: ");
        String posicionAlfil = sc.next().toLowerCase();

        int cont1 = 1;
        int cont2 = 0;
        String[] pos = new String[28];
        int letra = posicionAlfil.charAt(0)-'a' +1;
        int numero = Integer.parseInt(String.valueOf(posicionAlfil.charAt(1)));

        System.out.println();
        for (int f = 1; f <= 8; f++) {
            System.out.print(cont1++ + "    ");
            for (int c = 1; c <= 8; c++) {
                if (f == numero && c == letra) {
                    System.out.print("A  ");
                } else if (Math.abs(letra - c) == Math.abs(numero - f)) {
                    System.out.print("-  ");
                    char posicion_letra = (char) ('a' + c - 1);
                    pos[cont2++] = posicion_letra + "" + f;
                } else {
                    System.out.print("*  ");
                }
            }System.out.println();
        }
        System.out.println("\n     A  B  C  D  E  F  G  H");
        System.out.print("\nPosiciones alcanzables por el alfil: ");
        for (int i = 0; i < cont2; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println();
    }
}

