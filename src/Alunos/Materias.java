package Alunos;

import Alunos.Aluno;

import java.util.Scanner;

public class Materias {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Matheus";
        aluno1.matricula = 101;
        aluno1.disciplina1 = "Fisica";
        aluno1.disciplina2 = "Matemática";
        aluno1.disciplina3 = "Português";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "William";
        aluno2.matricula = 102;
        aluno2.disciplina1 = "História";
        aluno2.disciplina2 = "Geografia";
        aluno2.disciplina3 = "Português";
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a matricula do aluno: ");
        int numeromatricula = scan.nextInt();

        Aluno alunos[] = new Aluno[2];
        alunos[0] = aluno1;
        alunos[1] = aluno2;

        for (int i = 0; i < alunos.length; i++) {
            if (numeromatricula == alunos[i].matricula || numeromatricula == alunos[1].matricula) {
                System.out.println("Matriculado!");
                break;

            } else {
                System.out.println("Inválido");
                break;

            }
        }

        System.out.println("O que deseja fazer? 1 - inserir notas; 2 - ver atual");
        int desejo = scan.nextInt();

        System.out.println("");
    }
}
