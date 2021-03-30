package ImpostoRenda;

import java.util.Scanner;

public class TesteReceita {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        ReceitaFederal receitinha = new ReceitaFederal();
        Contribuinte trouxa ;

        for (int i = 0; i < 6; i++) {
        System.out.println("Qual o nome do contribuinte: ");
        String nomecontribuinte = scan.next();
        receitinha.addContribuinte(new Contribuinte());

            System.out.println("1 - Pessoa Juridica; 2 - Pessoa Física");
            int pessoa = scan.nextInt();

            if (pessoa == 1) {
                System.out.println("Qual o valor: ");
                System.out.println("O valor a ser pago é: " + receitinha.PessoaJuridica(scan.nextDouble()));
            } else if (pessoa == 2) {
                System.out.println("Qual o valor: ");
                System.out.println("O valor a ser pago é: " + receitinha.PessoaFisica(scan.nextDouble()));
            } else {
                System.out.println("Inválido!");
            }
        }
    }
}
