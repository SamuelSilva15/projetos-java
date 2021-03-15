package For;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args){

        boolean infoValida = false;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Insira um nome: ");
            String nome = scan.next();

            if(nome.length() >= 3){
                    infoValida = true;

            } else{
                System.out.println("Deve possuir no minimo 3 letras");

            }

        } while (!infoValida);{

        }

        do {
            System.out.println("Insira a idade: ");
            int idade = scan.nextInt();

            if(idade >= 0 && idade <= 150){
                infoValida = true;

            } else{
                System.out.println("Idade deve estar entre 0 e 150");

            }

        } while (!infoValida);{

        }

        do {
            System.out.println("Insira o salário");
            double salario = scan.nextDouble();

            if(salario > 0){
                infoValida = true;

            } else{
                System.out.println("Deve ser maior que zero");

            }

        } while (!infoValida);{

        }

        do {
            System.out.println("Insira o sexo: m ou f");
            String sexo = scan.next();

            if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")){
                infoValida = true;

            } else{
                System.out.println("Inexistente");

            }

        } while (!infoValida);{

        }

        do {
            System.out.println("Insira o estado civil: s, c, v, e d");
            String estadocivil = scan.next();

            if(estadocivil.equalsIgnoreCase("s") || estadocivil.equalsIgnoreCase("c") ||
            estadocivil.equalsIgnoreCase("v") || estadocivil.equalsIgnoreCase("d")){
                infoValida = true;

            } else{
                System.out.println("Insira s, c, v ou d");

            }

        } while (!infoValida);{

        }


    }
}
