import java.util.Random;

public class ex {

    public static void main (String[] args) {

        int [][] numeros = new int [5][5];

        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++){
                numeros[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println(" ");
        }

        int maiorl8 = 0;
        int menorl8 = 101;
        int linha5 = 4;;

        for (int i = 0; i < numeros[linha5].length; i++) {

            if (numeros[linha5][i] > maiorl8) {
                maiorl8 = numeros[linha5][i];
            }
            if (numeros[linha5][i] < menorl8) {
                menorl8 = numeros[linha5][i];
            }
        }
         System.out.println("Maior número da linha 5 é: " + maiorl8);
         System.out.println("Menor número da linha 5 é: " + menorl8);
    }
}
