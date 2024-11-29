/* Vamos a codificar en Java un programa “Principal.java” que solicitará al usuario una dirección de email

y la enviará al proceso “ValidaMail.java”, que se encargará de validarlo.

Si el email no supera la validación en 3 ocasiones, el programa “Principal.java” informará al usuario de

esta circunstancia y finalizará. Por otro lado, si “ValidaMail” decide que el mail es correcto, el programa

“Principal.java” felicitará al usuario y también finalizará.

Las 4 reglas de validación que tendrá que efectuar “ValidaMail” sobre el email recibido son:



1. El email ha de contener el carácter “@”. Si no contuviera este carácter, debería imprimir el

mensaje:ERROR: El email no contiene una @!

2. Detrás de la “@”, el email ha de tener un segundo identificador(“hotmail.com” o “gmail.org” p

ej.). Si directamente detrás de la “@, no tenemos nada, debería imprimir el mensaje:ERROR:

No existe segundo identificador!

3. Antes de la “@”, el email ha de tener un primer identificador con una longitud mínima de 3

caracteres. Si no se cumpliera esta condición, debería imprimir el mensaje:ERROR: El primer

identificador ha de tener una longitud mínima de 3 caracteres!

4. Si el dominio del email no es ni “.com”., ni “.es”, ni “.org”, debería imprimir el mensaje: ERROR:

El dominio no es ni com/es/org! Si el email supera estas 4 validaciones, entonces el

email es válido. */



import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un correo electrónico: ");
        String correo = sc.next().toLowerCase();
        ProcessBuilder pb = new ProcessBuilder("java", "ej10_ValidaMail.java", correo);
        pb.directory(new File("C:\\Users\\ivanm\\OneDrive\\Desktop\\IVAN\\CURSO 2ºDAM\\programacion de servicios\\Ejercicios procedimientos\\src"));
        Process proceso=pb.start();

        try{
            InputStream is = proceso.getInputStream();
            int c;
            while ((c = is.read()) != -1)
                System.out.print((char) c);
            is.close();
        }catch(Exception e) {
            e.getMessage();
        }
    }
}



/* public class ej10_Principal {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int intentos = 0;

        boolean emailValido = false;



        while (intentos < 3 && !emailValido) {

            System.out.print("Introduce un correo electrónico: ");

            String correo = sc.next().toLowerCase();



            // Crear el proceso para validar el correo

            ProcessBuilder pb = new ProcessBuilder("java", "ej10_ValidaMail", correo);

            pb.directory(new File("C:\\Users\\ivanm\\OneDrive\\Desktop\\IVAN\\CURSO 2ºDAM\\programacion de servicios\\Ejercicios procedimientos\\src"));

            Process proceso = pb.start();



            // Leer la salida del proceso

            try (InputStream is = proceso.getInputStream()) {

                int c;

                StringBuilder salida = new StringBuilder();

                while ((c = is.read()) != -1) {

                    salida.append((char) c);

                }

                System.out.println(salida);



                // Analizar la salida del proceso para determinar si el correo es válido

                if (salida.toString().contains("es valido")) {

                    emailValido = true;

                    System.out.println("¡Felicidades! El correo es válido.");

                } else {

                    intentos++;

                    if (intentos < 3) {

                        System.out.println("Por favor, inténtalo de nuevo. Intento " + intentos + "/3.");

                    }

                }

            }

        }



        if (!emailValido) {

            System.out.println("Has superado el número máximo de intentos. El programa ha finalizado.");

        }

    }

} */