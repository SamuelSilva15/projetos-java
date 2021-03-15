import java.util.Random;

public class Ex02 {

    public static void main(String[] args) {

        int[][] numerosa = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosa.length; i++) {

            for (int j = 0; j < numerosa.length; j++) {
                numerosa[i][j] = numeroRandom.nextInt(100);
            }
        }

        for (int i = 0; i < numerosa.length; i++) {
            for (int j = 0; j < numerosa.length; j++) {
                System.out.print(numerosa[i][j] + " ");
            }
            System.out.println(" ");
        }
        int maiorl5 = 0;
        int menorl5 = 101;
        int linha5 = 5;
        for (int i = 0; i < numerosa[linha5].length; i++) {

            if (numerosa[linha5][i] > maiorl5) {
                maiorl5 = numerosa[linha5][i];
            }
            if (numerosa[linha5][i] < menorl5) {
                menorl5 = numerosa[linha5][i];
            }
        }

        System.out.println("Maior valor linha 5: " + maiorl5);
        System.out.println("Maior valor linha 5: " + menorl5);

        int menorc7 = 101;
        int maiorc7 = 0;
        int col7 = 6;
        for (int i = 0; i < numerosa.length; i++) {

                if (numerosa[i][col7] > maiorc7) {
                    maiorc7 = numerosa [i][col7];
                }
                if (numerosa[i][col7] < menorc7) {
                    menorc7 = numerosa [i][col7];
                }

        }
        System.out.println("Maior valor linha 7: " + maiorc7);
        System.out.println("Menor valor linha 7: " + menorc7);
    }
}
