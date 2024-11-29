
// 3. Introduce 10 palabras y te muestre por
// pantalla la lista original y la ordenada (colecciones)*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();
        System.out.println();

        for (int i = 0; i < 10; i++){
            System.out.println("Introduce una palabra: ");
            String palabra = sc.next();
            palabras.add(palabra);
        }
        System.out.println("\nLista original: "+palabras);
        Collections.sort(palabras);
        System.out.println("\nLista ordenada: "+palabras);
    }
}
