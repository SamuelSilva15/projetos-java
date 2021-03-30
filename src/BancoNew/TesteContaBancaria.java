package BancoNew;

import java.util.Scanner;

public class TesteContaBancaria {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Banco banco = new Banco();

        int desejo = 0;
        while (desejo != 3){
            System.out.println("1 - Criar nova conta; 2 - Ver conta; 3  - Sair");
            desejo = scan.nextInt();
            if(desejo == 1) {
                criarNovaConta(scan, banco);
                continue;
            }
            else if (desejo == 2) {
                visualizarConta(scan, banco);
                continue;
            }
        }
    }

    private static void visualizarConta(Scanner scan, Banco banco) {
        System.out.println("Insira o número da conta: ");
        Cliente cliente = banco.procuraCliente(scan.nextInt());
        System.out.println("1 - Saldo; 2 - Saque; 3 - Depósito; 4 - Poupança");
        int vontade  = scan.nextInt();
        if(vontade == 1){
            System.out.println(cliente.getContaBancaria().getSaldo());
        }
        else if (vontade == 2) {
            System.out.println("Insira quanto deseja sacar: ");
            System.out.println(cliente.getContaBancaria().sacar(scan.nextDouble()));

        }
        else if (vontade == 3){
            System.out.println("Insira quanto deseja depositar: ");
            cliente.getContaBancaria().depositar(scan.nextDouble());
        }
        else if (vontade ==4){
            System.out.println("Insira há quanto dias está rendendo: ");
            System.out.println("Insira a taxa: ");
            ContaBancaria.ContaEspecial.ContaPoupanca poupanca = new ContaBancaria.ContaEspecial.ContaPoupanca();
            System.out.println(poupanca.getDiaRendimento(scan.nextInt(), scan.nextDouble()));

        }
    }

    private static void criarNovaConta(Scanner scan, Banco banco) {
        System.out.println("Insira o nome: ");
        String nomecliente = scan.next();
        System.out.println("Insira o número da conta: ");
        int numero_conta = scan.nextInt();
        //banco.addcliente(new Cliente(nomecliente, numero_conta));

    }
}
