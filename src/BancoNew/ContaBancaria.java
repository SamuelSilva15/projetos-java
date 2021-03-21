package BancoNew;

public class ContaBancaria {
    private final int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double sacar(double saque) {
        return getSaldo() - saque;
    }


    public double depositar(double deposito) {
        return getSaldo() + deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

}