package Animais;

import java.util.Scanner;

public class TesteAnimais {

    public static void main(String[] args) {
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setTamanho(150);
        camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setTamanho(300);
        tubarao.setVelocidade(1.5);

        Mamífero urso = new Mamífero();
        urso.setNome("Urso-do-Canadá");
        urso.setTamanho(180);
        urso.setCor("Vermelha");
        urso.setVelocidade(0.5);

        Animal [] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("---------------------");
        for (Animal animal: animais){
            System.out.println(animal);
            System.out.println("----------------------");
        }
    }
}
