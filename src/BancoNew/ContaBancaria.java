package BancoNew;

public class ContaBancaria {
    private final int numeroConta;
    private double saldo;
    private ContaEspecial contaespecial;

        public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        }

        public double sacar(double saque) {
            if(saque < 0 && saque <= contaespecial.getLimite()){
                return getSaldo() - saque;
            }
          return getSaldo();
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

        public static class ContaEspecial{
        private double limite;

        public double getLimite (){
            return this.limite;

        }

        public static class ContaPoupanca {

            public double getDiaRendimento(int Diarendimento ,double taxa){
                return Diarendimento * taxa;

            }
        }
    }
}