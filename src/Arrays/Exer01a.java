import java.util.Scanner;
public class Exer01a {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int [] elementosA = new int[5];

        int [] elementosB = new int[elementosA.length];


        for (int i = 0; i < elementosA.length; i++) {
            System.out.println("Entre com o valor da posição: " +  i);
            elementosA[i] = scan.nextInt();

            elementosB[i] = elementosA[i];
        }

        System.out.print("Elemento A: ");
        for (int i = 0; i < elementosA.length; i++) {
            System.out.print(elementosA[i] + "");
            elementosB[i] = elementosA[i];

        }
        System.out.println();
        System.out.print("Elemento B: ");
        for (int i = 0; i < elementosB.length; i++) {
            System.out.print(elementosB[i] + "");
            elementosB[i] = elementosA[i];

        }


    }
}
