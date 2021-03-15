package Unidadestempo;

import java.util.Scanner;

public class TesteConversaoTempo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("O que deseja fazer? m - h - d - s - mes - a ");
        String desejo = scan.next();

        System.out.println("Insira o valor: ");
        int valor = scan.nextInt();

        if(desejo.equalsIgnoreCase("M")){
            ConversaoDeUnidadesDeTempo.minutopraseg(valor);

        }

        else if (desejo.equalsIgnoreCase("H")){
            ConversaoDeUnidadesDeTempo.horapraminu(valor);

        }

        else if (desejo.equalsIgnoreCase("D")){
            ConversaoDeUnidadesDeTempo.diaprahora(valor);

        }

        else if (desejo.equalsIgnoreCase("S")){
            ConversaoDeUnidadesDeTempo.semanapradia(valor);

        }

        else if (desejo.equalsIgnoreCase("MES")){
            ConversaoDeUnidadesDeTempo.mespradia(valor);

        }

        else if (desejo.equalsIgnoreCase("A")){
            ConversaoDeUnidadesDeTempo.anopradia(valor);

        } else {
            System.out.println("Inválido");
        }
    }
}
