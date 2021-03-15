package banco;

public class ContaCorrente {

    String nome;
    int numero;
    double saldo;
    String status;
    double limite;


    void depositar (double valor){

      saldo = saldo + valor;
    }

    void sacar (double valor){
        double saq = saldo - valor;
        if (saq > limite ) {
            saldo = saq;
            System.out.println("Operação realizada");
        } else  {
            System.out.println("Saldo insuficiente");
        }
    }

    double getSaldo (){
       return saldo;
    }

    String gotStatus() {
        if (saldo < 0){
            return "Está usando";
        } else {
            return "Não tá";
        }
    }
}
