import java.util.Scanner;
public class Exer18 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Número 1: ");
        double n1 = scan.nextDouble();
        System.out.println("Número 2: ");
        double n2 = scan.nextDouble();

        System.out.println("Qual operação deseja realizar?");
        String mat = scan.next();

        double resultado= 0;
        boolean valide = true;

        switch (mat) {
            case "S": resultado = n1+n2; break;
            case "M": resultado = n1-n2; break;
            case "V": resultado = n1*n2; break;
            case "D": resultado = n1/n2; break;
            case "s": resultado = n1+n2; break;
            case "m": resultado = n1-n2; break;
            case "v": resultado = n1*n2; break;
            case "d": resultado = n1/n2; break;
            default: System.out.println("Inválido"); valide = false;
        }
        if (valide) {
            System.out.println("Resultado = "  + resultado);
            if(resultado >= 0) {
                System.out.println("Resultado positivo");
            }

            else {
                System.out.println("Resultado negativo");
            }

            if (resultado % 2 == 0) {
                System.out.println("Par");
            }
            else {
                System.out.println("Impar");
            }
        }

    }

}

