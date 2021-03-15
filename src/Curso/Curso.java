package Curso;

public class Curso {

    private static int NUMERO_MAXIMO_DE_ALUNOS = 5;

    private String nome;
    private double horario;
    private Professor professor;
    private Aluno[] alunos;
    private int ultimoAlunoAdicionado = 0;

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addAluno(Aluno aluno) {
        if (this.alunos == null) {
            this.alunos = new Aluno[NUMERO_MAXIMO_DE_ALUNOS];
        }
        this.alunos[ultimoAlunoAdicionado++] = aluno;
    }

    public void procurarAluno (Aluno aluno) {
        
    }
}