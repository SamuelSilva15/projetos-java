package For;

import java.util.Scanner;

public class Exer20 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número de alunos: ");
        int valor1 = scan.nextInt();
        int n = valor1;

        int soma = 0;
        int alunos [] = new int [n];

        for (int i = 0; i < alunos.length; i++){
            System.out.println("Insira a idade do aluno: ");
            int alunoidade = scan.nextInt();
            alunos[i] = alunoidade;
            soma = soma + alunoidade;

        }
        int media = soma / n;
        if(media > 60){
            System.out.println("Velhos");
        }
        else if(media > 20 && media < 60){
            System.out.println("Adultos");
        }
        else {
            System.out.println("Jovens");
        }
    }
}
