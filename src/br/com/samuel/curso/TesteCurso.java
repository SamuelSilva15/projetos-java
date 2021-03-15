package br.com.samuel.curso;

import java.util.Scanner;

public class TesteCurso {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Curso cursinho = criaCurso();

        System.out.println("Qual o nome do aluno?");
        String nomealuno = scan.next();
        System.out.println("Qual o número da matricula?");
        int matricula = scan.nextInt();
        cursinho.procurarAluno(matricula);
        Aluno aluninho = new Aluno(nomealuno, matricula);

        if (cursinho.procurarAluno(matricula) != null)
        {
            System.out.println("Qual a nota do primeiro semestre: ");
            int notaprimeiro = scan.nextInt();
            System.out.println("Qual a nota do primeiro semestre: ");
            int notasegundo = scan.nextInt();
            System.out.println("Qual a nota do primeiro semestre: ");
            int notaterceiro = scan.nextInt();
            System.out.println("Qual a nota do primeiro semestre: ");
            int notaquarto = scan.nextInt();

            aluninho.setNotaPrimeiroSemestre(notaprimeiro);
            aluninho.setNotaSegundoSemestre(notasegundo);
            aluninho.setNotaTerceiroSemestre(notaterceiro);
            aluninho.setNotaQuartoSemestre(notaquarto);

            aluninho.getMedia();

            if(aluninho.getMedia() < 7){
                System.out.println("Reprovado");
            }
            else if (aluninho.getMedia() > 7){
                System.out.println("Aprovado");
            }
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
