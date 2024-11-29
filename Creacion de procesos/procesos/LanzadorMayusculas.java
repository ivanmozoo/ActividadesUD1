import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LanzadorMayusculas {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);



        System.out.print("\nIntroduce una cadena: ");

        String cadena= sc.nextLine();



        System.out.print("\nIntroduce una cadena para saber si es un palindromo: ");

        String palindromos= sc.nextLine();



        ProcessBuilder pb = new ProcessBuilder("java", "ej8_MayusculasPalindromo.java", cadena, palindromos);

        pb.directory(new File("C:\\Users\\ivanm\\OneDrive\\Desktop\\IVAN\\CURSO 2ºDAM\\programacion de servicios\\Ejercicios procedimientos\\src"));

        Process p = pb.start();



        try{

            InputStream is = p.getInputStream();

            int c;

            while ((c = is.read()) != -1)

                System.out.print((char) c);

            is.close();

        }catch(Exception e) {

            e.getMessage();

        }

    }

}


