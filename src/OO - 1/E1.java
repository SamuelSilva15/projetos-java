
public class E1 {

    public static void main (String [] args){

        Produtos lampada = new Produtos();
        lampada.modelo = "A60";
        lampada.tensao = "bivolt";
        lampada.volts = 220;
        lampada.preco = 12.20;
        System.out.println(lampada.volts);
        System.out.println(lampada.preco);
        lampada.tipos = new String[5];
        lampada.tipos [0] = "Abajaur";
        lampada.tipos [1] = "Lampião";


    }
}
