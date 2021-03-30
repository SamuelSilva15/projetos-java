package FiguraGeometrica;

public class Cilindro extends Figura3D implements DimensaoVolumetrica{

    private int raio;
    private int altura;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double CalcularArea(){
        double AreaBase = Math.PI * (raio * raio);
        double AreaLateral = 2 * Math.PI * raio * altura;
        double AreaTotal = (2*AreaBase) * AreaLateral;

        return AreaTotal;

    }
    public double CalcularVolume(){
        return Math.PI * (raio * raio) * altura;

    }
}
