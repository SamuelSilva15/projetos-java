package Contato;

import Contato.expection.AgendaCheiaException;

import java.util.Scanner;

public class TesteContato {
    public static void main(String[] args) throws AgendaCheiaException {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int desejo = 0;
        while(desejo != 3) {
            System.out.println("1 - Consultar um contato; 2 - Criar novo contato 3 - sair");
            desejo = scan.nextInt();

            if (desejo == 1) {

                System.out.println("Insira o identificador: ");
                Contato contato = agenda.procuraContato(scan.nextInt());
                System.out.println(contato.toString());

            } else if (desejo == 2) {

                System.out.println("Insira o telefone: ");
                int telefone = scan.nextInt();
                System.out.println("Insira o identificador: ");
                int id = scan.nextInt();
                System.out.println("Insira o nome: ");
                String nome = scan.next();
                System.out.println("Insira o email: ");
                String email = scan.next();
                agenda.addContato(new Contato(telefone, id, nome, email));

            } else {
                System.out.println("Inválido!");
            }
        }
    }
}
