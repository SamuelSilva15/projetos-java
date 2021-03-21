package br.com.samuel.curso;

public class Aluno {

    private static int NUMERO_MAXIMO_DE_NOTAS = 4;

    private String nomeAluno;
    private int matricula;
    private int notas[] = new int[4];
    private int ultimaNotaAdicionada = 0;

    public Aluno(String nomeAluno, int matricula) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
    }

    public void addNota(int nota) {
        if (this.notas == null) {
            this.notas = new int[NUMERO_MAXIMO_DE_NOTAS];
        }
        this.notas[ultimaNotaAdicionada++] = nota;
    }


    public int getMedia() {
        int soma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            soma = soma + this.notas[i];
        }
        return soma / 4;
    }

    public String getAprovacao(){
        if(getMedia() >= 7){
            return "Aprovado";
        }

            return "Desaprovado";
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getMatricula() {
        return matricula;
    }
}
