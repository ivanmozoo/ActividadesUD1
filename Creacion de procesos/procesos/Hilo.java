public class Hilo extends Thread {
    public void contador(){
        for (int i=1; i<10; i++){
            System.out.println(getName() + "Nº "+i);

        }
    }

    public void run(){
        contador();
    }

    public Hilo(String nom){
        super(nom);
    }

    public static void main(String[] args) {
        Hilo a= new Hilo("Ivan");
        a.start();
        Hilo b= new Hilo("Mozo");
        b.start();
    }
}

