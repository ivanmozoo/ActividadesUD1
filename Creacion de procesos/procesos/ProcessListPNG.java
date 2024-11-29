/* Crea un proyecto llamado ProcessListPNG con un programa que le
pida al usuario que introduzca una ruta (por ejemplo, /micarpeta/fotos)
y luego inicie un proceso que muestre una lista de todas las
imágenes PNG encontradas en esta ruta. */


import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class ProcessListPNG {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try {
            System.out.print("\nIntroduce una ruta: ");
            String ruta= sc.next();
            System.out.println("\nImágenes png:");
            System.out.println();

            ProcessBuilder proceso= new ProcessBuilder();
            File carpeta = new File(ruta);

            proceso.command("bash","-c","ls *.png");
            proceso.directory(carpeta);
            Process p=proceso.start();

            InputStream is = p.getInputStream();
            int c;
            while((c = is.read())!=-1)
                System.out.print((char)c);
            is.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

