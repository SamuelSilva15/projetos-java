import java.util.Scanner;
public class Exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número entre 0 e 10");
        int num = scan.nextInt();
        boolean NotaValida = false;

        do {

            if (num >= 0 && num <= 10) {
                NotaValida = true;
                System.out.println("Nota é:" + num);

            } else {
                System.out.println("Nota inválida, digite uma nota válida");
            }

        } while (!NotaValida);
    }
}
