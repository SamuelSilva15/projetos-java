package banco;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main (String[] args){
        ContaCorrente contaCorrente1 = new ContaCorrente();
        contaCorrente1.nome = "Carlos";
        contaCorrente1.numero = 100;
        contaCorrente1.limite = 1000;

        ContaCorrente contaCorrente2 = new ContaCorrente();
        contaCorrente2.nome = "Jonnatas";
        contaCorrente2.numero = 101;
        contaCorrente2.limite = 2000;

        ContaCorrente contascorrentes[] = new ContaCorrente [2];

        contascorrentes[0] = contaCorrente1;
        contascorrentes[1] = contaCorrente2;

        Scanner scan = new Scanner(System.in);


        System.out.println("Informe sua agência: ");
        int numero = scan.nextInt();

        ContaCorrente atual = null;
        for (int i = 0; i < contascorrentes.length; i++) {
            if (numero == contascorrentes[i].numero) {
                atual = contascorrentes[i];
                break;
            }
        }


        if (atual != null) {
            System.out.println("O que deseja fazer? 1 - depositar; 2 - saque; 3 - Saldo");
            int desejo = scan.nextInt();

            if (desejo == 1){
                System.out.println("Quanto quer depositar? ");
                double dep = scan.nextDouble();
                atual.depositar(dep);


            }
            else if  (desejo == 2) {
                System.out.println("Quanto quer sacar? ");
                double saq = scan.nextDouble();
                atual.sacar(saq);


            }
            else if (desejo == 3) {


            }

            else {
                System.out.println("Inválido");
                return ;
            }
            System.out.println(atual.saldo);
            System.out.println(atual.gotStatus());
        } else {
            System.out.println("Insira outro numero");
        }
    }
}
