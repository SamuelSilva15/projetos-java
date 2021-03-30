package Animais;

public class Animal {
    private String nome;
    private int tamanho;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal (int patas){
        this.patas = patas;
    }

    public Animal() {
        this.setPatas(4);
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public int setTamanho (int tamanho) {
        return this.tamanho = tamanho;
    }

    public int getPatas() {
        return patas;
    }

    public int setPatas (int patas) {
        return this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public String setCor(String cor) {
        return this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public String setAmbiente(String ambiente) {
        return this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double setVelocidade(double velocidade) {
        return this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "\n Nome:" + nome + '\'' +
                "\n Tamanho: " + tamanho +
                "\n Patas: " + patas +
                "\n Cor: " + cor + '\'' +
                "\n Ambiente: " + ambiente + '\'' +
                "\n Velocidade: " + velocidade
                ;
    }
}
