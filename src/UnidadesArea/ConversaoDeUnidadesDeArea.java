package UnidadesArea;

public class ConversaoDeUnidadesDeArea {

    static void metroparapés (double valor){
        double metro = valor * 10.76;
        System.out.println(metro + "pés");

    }

    static void pésparacentimenro (double valor){
        double pés = valor * 929;
        System.out.println(pés + "centímetro");
    }

    static void milhaparaacres (double valor){
        double milha = valor * 640;
        System.out.println(milha + "acre");
    }

    static void acreparapés (double valor){
        double acre = valor * 43.560;
        System.out.println(acre + "pés");
    }
}