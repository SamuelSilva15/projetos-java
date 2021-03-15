import java.util.Scanner;
public class Exer02a {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);


        int [] elementosa = new int[8];
        int [] elementesb = new int [8];

        for (int i = 0; i < elementosa.length; i++){
            System.out.println("Entre com o valor da posição: ");
            elementosa [i] = scan.nextInt();

        }

        System.out.print("Elemento A: ");
        for (int i = 0; i < elementosa.length; i++){
            System.out.print(elementosa[i] + " ");
            elementesb [i] = elementosa[i]*2;

        }
        System.out.println("");
        System.out.print("Elemento B: ");
        for (int i = 0; i < elementesb.length; i++ ){
            System.out.print(elementesb[i] + " ");

        }
    }
}
