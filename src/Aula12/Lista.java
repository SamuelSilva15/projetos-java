package Aula12;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lista<T> {
    private T[] elementos;
    private int tamanho = 10;

    public void empilha(T elemento){
        elementos[tamanho] = elemento;
        tamanho++;
        System.out.println(elementos);
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    public T desempilha(T elemento){

        if(this.estaVazia()){
            return null;
        }
        return this.elementos[--tamanho];
    }
}
