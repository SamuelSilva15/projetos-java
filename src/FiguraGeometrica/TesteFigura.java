package FiguraGeometrica;

public class TesteFigura {

    public static void main (String[] args){

        Quadrado quadrado = new Quadrado();
        quadrado.setLadoq(6);
        quadrado.setNome("Quadrado");

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(3);
        triangulo.setBase(4);
        triangulo.setNome("Triângulo");

        Circulo circulo = new Circulo();
        circulo.setRaio(5);
        circulo.setNome("Circulo");

        Cubo cubo = new Cubo();
        cubo.setLado(3);
        cubo.setNome("Cubo");

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(3);
        cilindro.setRaio(4);
        cubo.setNome("Cilindro");

        FiguraGeometrica [] figura = new FiguraGeometrica[5];
        figura[0] = quadrado;
        figura[1] = triangulo;
        figura[2] = cubo;
        figura[3] = cilindro;
        figura[4] = circulo;

        for (FiguraGeometrica fi : figura){
                System.out.println("------------------");
                System.out.println(fi.getNome());

                if (fi instanceof Figura2D){
                    Figura2D f2d = (Figura2D) fi;
                    System.out.println("Área: " + f2d.CalcularArea());
                }
                if (fi instanceof  Figura3D){
                    Figura3D f3d = (Figura3D) fi;
                    System.out.println("Área: " + f3d.CalcularArea());
                    System.out.println("Volume: " + f3d.CalcularVolume());
                }
        }
    }
}
