import java.util.Random;

public class ex1 {

    public static void main (String[] args) {

        int num [][] = new int [26][26];

        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++){
                num [i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++) {
                System.out.println(num[i][j] + " ");
            }
            System.out.println(" ");
        }

        

    }
}
