package Curso;

public class Aluno {

    private String nomeAluno;
    private int matricula;
    private int notaPrimeiroSemestre;
    private int notaSegundoSemestre;
    private int notaTerceiroSemestre;
    private int notaQuartoSemestre;

    public Aluno(String nomeAluno, int matricula) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
    }


    public int getMedia() {
        int soma = (this.notaPrimeiroSemestre + this.notaSegundoSemestre + this.notaTerceiroSemestre + this.notaQuartoSemestre);
        return soma / 4;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getNotaPrimeiroSemestre() {
        return notaPrimeiroSemestre;
    }

    public int getNotaSegundoSemestre() {
        return notaSegundoSemestre;
    }

    public int getNotaTerceiroSemestre() {
        return notaTerceiroSemestre;
    }

    public int getNotaQuartoSemestre() {
        return notaQuartoSemestre;
    }

    public void setNotaPrimeiroSemestre(int notaPrimeiroSemestre) {
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
    }

    public void setNotaSegundoSemestre(int notaSegundoSemestre) {
        this.notaSegundoSemestre = notaSegundoSemestre;
    }

    public void setNotaTerceiroSemestre(int notaTerceiroSemestre) {
        this.notaTerceiroSemestre = notaTerceiroSemestre;
    }

    public void setNotaQuartoSemestre(int notaQuartoSemestre) {
        this.notaQuartoSemestre = notaQuartoSemestre;
    }
}
