import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Leerweb {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tres webs" +
                " (www.uv.es@www.uji.es@www.ua.es): ");
        String webs = sc.next().toLowerCase();

        ProcessBuilder pb = new ProcessBuilder("java", "Visitaweb.java", webs);
        pb.directory(new File("/home/ivamozloz/Escriptori/curso 2ºDAM/programacion de servicios/Programas iniciales/Creacion de procesos/procesos"));
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
