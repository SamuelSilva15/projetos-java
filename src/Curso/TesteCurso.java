package Curso;

import java.util.Scanner;

public class TesteCurso {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        criaCurso();

        System.out.println("Qual aluno deseja ver?");
        String nomealuno = scan.next();

        
    }

    private static void criaCurso() {
        Curso curso = new Curso("Analise de sistema");
        curso.setHorario(7.30);

        Professor professor = new Professor("Jonnatas", "TI", "jonnatas@gmail.com");
        curso.setProfessor(professor);

        curso.addAluno(new Aluno("Samuel", 123));
        curso.addAluno(new Aluno("José", 1234));
        curso.addAluno(new Aluno("Tamiris", 12345));
        curso.addAluno(new Aluno("Maria", 123456));
        curso.addAluno(new Aluno("Caique", 1234567));
    }
}
