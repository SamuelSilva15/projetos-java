package Somatório;

public class Somatório {

   public static int somatorio (int valor) {
       int total = 0;
       if (valor == 1) {
           return 1;
       } else if (valor == 0 || valor < 0) {
           System.out.println("Inválido");
       }

       int cont = 1;
       while (cont++ < valor) {
            return cont++;
       }
       return cont++;
   }
}
