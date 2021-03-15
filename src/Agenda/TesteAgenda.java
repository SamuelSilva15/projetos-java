package Agenda;

import java.util.Scanner;

public class TesteAgenda {

        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            System.out.println("Entre com o nome da agente");
            String nome = scan.nextLine();
            Contato contato = new Contato();


            Contato[] contatos = new Contato[3];
            for( int i = 0; i <3; i++){
                System.out.println("Entre com as informações do contato: " + (i + 1));
                Contato c = new Contato();
                System.out.println("Entre com o nome: ");
                nome = scan.nextLine();
                c.setNome(nome);

                System.out.println("Entre com o telefone: ");
                String telefone = scan.next();
                c.setTelefone(telefone);

                System.out.println("Entre com o email: ");
                String email = scan.next();
                c.setEmail(email);

                contatos[i] = c;
            }


        }
}
