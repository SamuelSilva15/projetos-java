import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
public class Exer04a {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        double [] elementosa = new double[3];
        double [] elementos = new double [elementosa.length];

        for (int i = 0; i < elementosa.length; i++) {
            System.out.println("Insira a posição do elemento: ");
            elementosa [i] = scan.nextInt();

        }
        System.out.print("Elementos A: ");
        for (int i = 0; i < elementosa.length; i++) {
            System.out.print(elementosa[i] + " ");
            elementos [i] = Math.sqrt(elementosa[i]);
        }

        System.out.println();

        DecimalFormat d = new DecimalFormat("###,###,###");

        System.out.print("Elementos B: ");
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
            DecimalFormat df = new DecimalFormat("###,###,###");

        }
    }
}
