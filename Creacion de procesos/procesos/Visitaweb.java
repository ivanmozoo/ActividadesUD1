import java.io.IOException;

public class Visitaweb {

    public static void Webs(String cadena) throws IOException {
        String[] webs = cadena.split("@");

        if (webs.length==1){
            ProcessBuilder pb = new ProcessBuilder
                    ("firefox",webs[0]);
            pb.start();
        } else if (webs.length==2) {
            ProcessBuilder pb = new ProcessBuilder
                    ("firefox",webs[0],webs[1]);
            pb.start();
        } else if (webs.length==3) {
            ProcessBuilder pb = new ProcessBuilder
                    ("firefox",webs[0],webs[1],webs[2]);
            pb.start();
        } else if (webs.length>3) {
            System.out.println("\ndemasiadas webs!");
        }
    }

    public static void main(String[] args) throws IOException {
        String cadena= args[0];
        Webs(cadena);
    }
}
