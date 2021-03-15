import java.util.Scanner;
public class Exer02 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Nome do usuário: ");
        String nome = scan.next();
        System.out.println("Senha (apenas letras): ");
        String senha = scan.next();
        boolean usuario = false;
        do {

            if(nome.equalsIgnoreCase(senha)) {
                usuario = true;
                System.out.println("Inválido");

            }
            else {
                System.out.println("Ok");
            }
        } while (!usuario);
    }
}
