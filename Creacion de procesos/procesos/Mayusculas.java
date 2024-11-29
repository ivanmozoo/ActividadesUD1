/* Crea una clase que me pase una cadena a mayúsculas. Invocalo desde un proceso pasandole la cadena.

Haz el mismo ejercicio pero Averiguando si es palindromo, “Anita lava la tina”.

• Mejora: Crear un 3 archivos de tal manera qué:

1. palindromo.txt guarda las palabras que son palidromos, (ala, somos,polop,... ).

2. Nopalindromo.txt las palabras que no son palidromos.

3. todas.txt todas las palabras que introducimos */



import java.io.*;



public class Mayusculas {
    public static void Mayusculaas(String palabras){

        String conversion = palabras.toUpperCase();
        System.out.println("\nConversion de la cadena: "+conversion);
    }

    public static void Palindromos(String cadena) throws IOException {

        cadena = cadena.toLowerCase().replace("á","a").replace
                ("é", "e").replace("í", "i").replace
                ("ó", "o").replace("ú", "u").replace
                (".", "").replace(",", "");

        String invertida = new StringBuilder(cadena).reverse().toString();
        System.out.println("\n"+cadena+" es palindromo?: "+invertida.equals(cadena));

        if (invertida.equals(cadena)){
            File palindromos = new File("palindromo.txt");
            FileWriter writer2= new FileWriter(palindromos, true);
            writer2.write(cadena + System.lineSeparator());
            writer2.close();
            System.out.println("\n'"+cadena+"' se ha añadido al archivo 'palindromo.txt'");

        } else {

            File no_palindromos = new File("Nopalindromo.txt");
            FileWriter writer3= new FileWriter(no_palindromos, true);
            writer3.write(cadena + System.lineSeparator());
            writer3.close();
            System.out.println("\n'"+cadena+"' se ha añadido al archivo 'Nopalindromo.txt'");

        }

        File todos = new File("todas.txt");
        FileWriter writer= new FileWriter(todos, true);
        writer.write(cadena + System.lineSeparator());
        writer.close();

        System.out.println("\n'"+cadena+"' se ha añadido al archivo 'todas.txt'");
        System.out.println("\nContenido del archivo 'palindromo.txt':");
        leerArchivo("palindromo.txt");
        System.out.println("\nContenido del archivo 'Nopalindromo.txt':");
        leerArchivo("Nopalindromo.txt");
        System.out.println("\nContenido del archivo 'todas.txt':");
        leerArchivo("todas.txt");

    }



    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        if (archivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;

                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }

            } catch (IOException e) {
                System.out.println("Error al leer el archivo " + nombreArchivo + ": " + e.getMessage());
            }
        } else {
            System.out.println("El archivo '" + nombreArchivo + "' no existe.");
        }
    }



    public static void main(String[] args) throws IOException {
        String cadena = args[0];
        Mayusculaas(cadena);

        String palindromos = args[1];
        Palindromos(palindromos);

    }

}
