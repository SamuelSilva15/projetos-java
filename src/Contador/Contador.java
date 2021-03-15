package Contador;

public class Contador {

    private static int cont;


    public static void incrementar(){

        cont++;
    }

    public static void zerar(){

        cont = 0;
    }

    public static int obtervalor(){

    return cont;
    }
}
