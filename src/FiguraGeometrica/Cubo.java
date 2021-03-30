package FiguraGeometrica;

public class Cubo extends Figura3D implements DimensaoVolumetrica  {
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double CalcularArea(){
        return 6 * (lado*lado);
    }

    public double CalcularVolume(){
        return Math.pow(lado, 3);
    }
}
