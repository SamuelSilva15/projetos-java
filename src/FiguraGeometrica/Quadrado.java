package FiguraGeometrica;

public class Quadrado extends Figura2D {

    private int ladoq;

    public int getLadoq() {
        return ladoq;
    }

    public void setLadoq(int ladoq) {
        this.ladoq = ladoq;
    }

    public double CalcularArea(){
        return ladoq * ladoq;
    }
}
