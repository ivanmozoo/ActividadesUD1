import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Lanzador {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);

        System.out.print("\nIntroduce el primer numero: ");
        String num1= sc.next();
        System.out.print("\nIntroduce el primer numero (mayor que el anterior): ");
        String num2= sc.next();

        ProcessBuilder pb = new ProcessBuilder("java","Sumador.java",num1,num2);
        pb.directory(new File("/home/ivamozloz/Escriptori/curso 2ºDAM/" +
                "programacion de servicios/Creacion de procesos/src/"));
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
