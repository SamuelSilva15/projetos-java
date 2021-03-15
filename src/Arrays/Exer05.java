import java.util.Scanner;

public class Exer05 {
    public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int [] elementosa = new int [3];
    int [] elementos = new int [elementosa.length];

        for (int i = 0; i < elementosa.length; i++) {
        System.out.println("Insira a posição do elemento: ");
        elementosa [i] = scan.nextInt();

    }
            System.out.print("Elementos A: ");
        for (int i = 0; i < elementosa.length; i++) {
        System.out.print(elementosa[i] + " ");
        elementos [i] = elementosa[i] * i;

    }
        System.out.println();
        System.out.print("Elementos B: ");
        for (int i = 0; i < elementos.length; i++) {
        System.out.print(elementos[i] + " ");


    }
  }
}
