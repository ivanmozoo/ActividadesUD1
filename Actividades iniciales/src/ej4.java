
// 2. Arraylist aleatorio que calcula suma, media, max y min (colecciones)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ej4 {
    public static void main(String[] args) {

        int tamanyoListaAleatorio = new Random().nextInt(11) + 10;
        ArrayList <Integer> valores= new ArrayList<>(tamanyoListaAleatorio);

        Random random = new Random();
        int valorMaximo = 100;

        for (int i=0; i<tamanyoListaAleatorio; i++) {
            int valorAleatorio= random.nextInt(valorMaximo+1);
            valores.add(valorAleatorio);
        }

        int max = Collections.max(valores);
        int min = Collections.min(valores);
        int suma= 0;
        for (int valor : valores) {
            suma += valor;
        }
        int media= suma/valores.size();

        System.out.println("\nLista de valores: "+valores);
        System.out.println("\nHay "+tamanyoListaAleatorio+" valores, el" +
                " mínimo es "+min+", el máximo "+max+", la suma de todos da "+suma+", y la media "+media+".");

    }
}

