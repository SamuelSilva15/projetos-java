package Alunos;

import java.util.Scanner;

public class Aluno {

    String nome;
    int matricula;
    String curso;
    String disciplina1;
    String disciplina2;
    String disciplina3;
    double nota;
    double nota2;
    double nota3;
    Scanner scan = new Scanner(System.in);

    void aprovar (){

        if (nota >= 7) {
            System.out.println("Aprovado na matéria" + nota);
        } else {
            System.out.println("Desaprovado na matéria" + nota);
        }
        if (nota2 >= 7){
            System.out.println("Aprovado na matéria" + nota);
        } else {
            System.out.println("Desaprovado na matéria" + nota);
        }
        if (nota3 >= 7 ){
            System.out.println("Aprovado na matéria" + nota);
        } else{
            System.out.println("Desaprovado na matéria" + nota);
        }

    }
}
