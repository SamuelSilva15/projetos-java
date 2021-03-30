package FiguraGeometrica;

public class Triangulo extends Figura2D {


    private int altura;
    private int base;

    public int getAltura(int altura) {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase(int altura) {
        return base;
    }

    public void setBase(int altura) {
        this.base = base;
    }


    public double CalcularArea(){
        return altura * base / 2;
    }

}
