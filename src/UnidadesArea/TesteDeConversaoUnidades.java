package UnidadesArea;

import UnidadesArea.ConversaoDeUnidadesDeArea;

import java.util.Scanner;

public class TesteDeConversaoUnidades {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Conversão de unidades");
        System.out.println("O que deseja fazer? m - p - mil - a");
        String desejo = scan.next();

        System.out.println("Insira o valor");
        int valor = scan.nextInt();

        if (desejo.equalsIgnoreCase("M")){
            ConversaoDeUnidadesDeArea.metroparapés(valor);

        }

        else if (desejo.equalsIgnoreCase("P")){
            ConversaoDeUnidadesDeArea.pésparacentimenro(valor);

        }

        else if (desejo.equalsIgnoreCase("MIL")){
            ConversaoDeUnidadesDeArea.milhaparaacres(valor);

        }

        else if (desejo.equalsIgnoreCase("A")){
            ConversaoDeUnidadesDeArea.acreparapés(valor);

        }

        else {
            System.out.println("Inválido");
        }
    }
}
