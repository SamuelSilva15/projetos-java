package br.com.samuel.curso;

import java.util.Scanner;

public class TesteCurso {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Curso cursinho = criaCurso();

        System.out.println("Qual o número da matricula?");
        Aluno aluninho = cursinho.procurarAluno(scan.nextInt());

        if (aluninho != null) {
            for (int i = 1; i <= 4; i++) {
                System.out.println("Qual a nota do " + i + "º semestre: ");
                aluninho.addNota(scan.nextInt());
            }
            System.out.println(aluninho.getAprovacao());
        }
    }

    private static Curso criaCurso() {
        Curso curso = new Curso("Analise de sistema");
        curso.setHorario(7.30);

        Professor professor = new Professor("Jonnatas", "TI", "jonnatas@gmail.com");
        curso.setProfessor(professor);

        curso.addAluno(new Aluno("Samuel", 123));
        curso.addAluno(new Aluno("José", 1234));
        curso.addAluno(new Aluno("Tamiris", 12345));
        curso.addAluno(new Aluno("Maria", 123456));
        curso.addAluno(new Aluno("Caique", 1234567));

        return curso;
    }
}
