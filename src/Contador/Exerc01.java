package Contador;

import Contador.Contador;

public class Exerc01 {

    public static void ImprimirValor(){
        System.out.println(Contador.obtervalor());

    }

    public static void main(String[] args){

        ImprimirValor();

        Contador.incrementar();

        ImprimirValor();

        ImprimirValor();

        Contador.zerar();

        ImprimirValor();

    }
}
