import java.util.Scanner;
public class Exer10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu turno (M-V-N):");
        String turno = scan.next();

        if (turno.equals("M")) {
            System.out.println("Bom dia!");
        }

        else if (turno.equals("V")) {
            System.out.println("Boa tarde!");
        }

        else if (turno.equals("N")) {
            System.out.println("Boa noite!");
        }

        else if (turno.equals("m")) {
            System.out.println("Boa dia!");
        }

        else if (turno.equals("n")) {
            System.out.println("Boa noite!");
        }

        else if (turno.equals("v")) {
            System.out.println("Boa tarde!");
        }


    }
}