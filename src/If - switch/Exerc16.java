import java.util.Scanner;
public class Exerc16 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        int valora = scan.nextInt();
        System.out.println("Informe o valor de B: ");
        int valorb = scan.nextInt();
        System.out.println("Informe o valor de C: ");
        int valorc = scan.nextInt();

        double delta = valorb*valorb - 4*valora*valorc;
        double x1 = ((-valorb) + Math.sqrt(delta)) / (2*valora);
        double x2 = ((-valorb) - Math.sqrt(delta)) / (2*valora);

        if (valora == 0 ) {
            System.out.println("A equação não é de 2°grau!");

        }

        else if (delta < 0 ) {
            System.out.println("Delta negativo ");

        }

        else if (delta > 0 ) {
            System.out.println("Possui duas raízes reais");
            System.out.println("Raiz a: " + x1 );
            System.out.println("Raiz b: " +x2);

        }



    }

}
