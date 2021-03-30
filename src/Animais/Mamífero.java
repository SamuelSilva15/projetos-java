package Animais;

public class Mamífero extends Animal {
    private String alimento;

    public Mamífero() {
        this.setAlimento("Mel");
        this.setCor("Castanho");
        this.setAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
