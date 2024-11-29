// 1. Programa Arraylist de 6 compañeros (colecciones)

import java.util.ArrayList;

public class ej3 {
    public static void main(String[] args) {
        ArrayList<String> companeros = new ArrayList<>();
        companeros.add("Ivan");
        companeros.add("Dani");
        companeros.add("Raúl");
        companeros.add("Mario");
        companeros.add("Asier");
        companeros.add("Suli");

        System.out.println("\nLista de compañeros: \n");
        for (String comp : companeros){
            System.out.print(comp+"    ");
        }
        System.out.print("\n");
    }
}
