/* Crea un proyecto llamado ProcessKillNotepad con un programa que
arranque el bloc de notas o cualquier editor de texto similar desde
tu sistema operativo. Luego, el programa esperará 10 segundos a que
“finalice” el subproceso y, transcurrido ese periodo, será destruido.
Para dormir 10 segundos, utilice estas instrucciones: Thread.sleep(10000);*/


public class ProcessKillNotepad {
    public static void main(String[] args) {
        ProcessBuilder proceso= new ProcessBuilder();

        try {
            proceso.command("kwrite");
            Process p=proceso.start();

            Thread.sleep(10000);

            p.getInputStream();
            p.destroy();

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
