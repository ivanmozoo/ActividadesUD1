
// 2. array 3x6 tabla (arrays bidimensionales)

public class ej2 {
    public static void main(String[] args) {
        int [][] matriz= new int[3][6];

        matriz[1][0] = 75;
        matriz[2][2] = -2;
        matriz[2][3] = 9;
        matriz[2][5] = 11;
        matriz[0][5] = 5;
        matriz[0][1] = 30;
        matriz[0][2] = 2;

        System.out.print("\n         ");
        for (int f=0; f < matriz[0].length; f++) {
            System.out.print("Columna "+ f +"    ");
        }
        System.out.println();

        for (int c=0; c < matriz.length; c++) {
            System.out.print("Fila "+ c +"       ");
            for(int f=0; f < matriz[c].length; f++){
                System.out.print(matriz[c][f] + "            ");
            }
            System.out.println();
        }
    }
}

