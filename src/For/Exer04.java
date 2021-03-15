package For;

public class Exer04 {

    public static void main(String[] args){
        int popa = 80000;
        int popb = 200000;
        int cont = 0;
        

        while (popa < popb){

                popa += (popa/100) * 3;
                popb += (popb/100) * 1.5;
                cont++;
        }

        System.out.println("População da cidade: " + popa);
        System.out.println("População do país: " + popb);
        System.out.println("Ano que ocorreu: " + cont);
    }
}
