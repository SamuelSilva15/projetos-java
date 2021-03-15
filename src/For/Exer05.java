package For;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        boolean valido = false;
        double taxaA;
        double taxaB;
        double popa;
        double popb;

        do {
            System.out.println("Insira a população da cidade: ");
            popa = scan.nextDouble();

            if(popa > 0){
                valido = true;

            } else {
                System.out.println("A população precisa ser maior que 0");
            }
        } while (!valido); {

        }

        do {
            System.out.println("Insira a população do país: ");
             popb = scan.nextDouble();

            if(popb > 0){
                valido = true;

            } else {
                System.out.println("A população precisa ser maior que 0");
            }
        } while (!valido); {

        }

        valido = false;

        do {
            System.out.println("Insira a taxa de crescimento da população da cidade: ");
            taxaA = scan.nextDouble();

            if(taxaA > 0){
                valido = true;

            } else {
                System.out.println("A taxa precisa ser maior que 0");
            }
        } while (!valido); {

        }

        do {
            System.out.println("Insira a taxa de crescimento da população do país: ");
            taxaB = scan.nextDouble();

            if(taxaB > 0){
                valido = true;

            } else {
                System.out.println("A população precisa ser maior que 0");
            }
        } while (!valido);

        int cont = 0;

        while (popa < popb){
                popa += (popa/100) * taxaA;
                popb += (popb/100) * taxaB;
                cont ++;
        }

        System.out.println("População da cidade: " + popa);
        System.out.println("População do país: " + popb);
        System.out.println("Ano que ocorreu: " + cont);
    }
}
