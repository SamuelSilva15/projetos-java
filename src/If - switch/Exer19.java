import java.util.Scanner;
public class Exer19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o nome do interrogado:");
        String nome = scan.next();

        System.out.println("Telefonou para a vítima? (S/N");
        String resp1 = scan.next();
        System.out.println("Esteve no local? (S/N");
        String resp2 = scan.next();
        System.out.println("Mora perto da vítima? (S/N");
        String resp3 = scan.next();
        System.out.println("Devia para vítima? (S/N");
        String resp4 = scan.next();
        System.out.println("Já trabalhou com a vítima? (S/N");
        String resp5 = scan.next();

        int cont = 0;

        if (resp1.equals("S")) {
            cont++;
        }

        if (resp2.equals("S")) {
            cont++;
        }

        if (resp3.equals("S")) {
            cont++;
        }

        if (resp4.equals("S")) {
            cont++;
        }

        if (resp5.equals("S")) {
            cont++;
        }

        if (cont ==0 || cont == 1) {
            System.out.println(nome + "é inocente");
        }

        if (cont ==2) {
            System.out.println(nome + "é suspeito(a)");
        }

        if (cont ==3 || cont ==4) {
            System.out.println(nome + "é cúmplice");
        }

        if (cont ==5) {
            System.out.println(nome + "é o assassino(a)");
        }
    }
}
