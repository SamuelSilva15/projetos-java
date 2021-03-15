package Lampada;

public class Lampada {

    //lampadas
    String modelo;
    String tensao;
    int volts;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    double preco;
    boolean tipoAbajur;
    String[] tipos;
    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado(){

        if (ligada){
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }
}
