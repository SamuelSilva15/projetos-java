import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int [] [] oi = new int [4][4];
        Random random = new Random();

        for (int i = 0; i < oi.length; i++ ) {

            for (int j = 0; j < oi.length; j++ ) {
                oi [i] [j] = random.nextInt(100);
            }
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < oi.length; i++) {
            for (int j = 0; j < oi.length; j++)
            if (oi[i][j] > maior){
                maior = oi[i][j];
                linha = i;
                coluna = j;
            }

          System.out.println(" ");
        }

        for (int i = 0; i < oi.length; i++) {
            for (int j = 0; j < oi.length; j++) {
                System.out.print(oi [i] [j] + " ");
            }
           System.out.println(" ");
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}
