/* Crear una clase Java que sea capaz de sumar todos los números
 comprendidos entre dos valores incluyendo ambos valores. Para resolverlo
 crearemos una clase Sumador que tenga un método que acepte dos números n1
 y n2 y que devuelva la suma de todo el intervalor. Además, incluiremos un
 método main que ejecute la operación de suma tomando los números de la línea
 de comandos (es decir, se pasan como argumentos al main). Una vez hecha la prueba
 de la clase Sumador y crearemos una clase Lanzador que sea capaz de lanzar
 varios procesos utilizando el ProcessBuilder. */


public class Sumador {
    public static void Suma(int numero1, int numero2) {
        int suma=0;
        for (int i = numero1; i <= numero2; i++) {
            suma+=i;
        }
        System.out.println("\nLa suma de los numeros que hay entre "+numero1+" y "+numero2+" es: "+suma);;
    }

    public static void main(String[] args) {
        int num1= Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);
        Suma(num1,num2);
    }
}


