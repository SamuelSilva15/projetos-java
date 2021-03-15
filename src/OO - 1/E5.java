public class E5 {

    public static <contaCorrente> void main (String[] args){

        ContaCorrente banco = new ContaCorrente();

        banco.numero = 12334;
        banco.agencia = 0101;
        banco.especial = true;
        banco.limite = 500;
        banco.saldo = 250.25;

        System.out.println("Número da conta: " + banco.numero);
        System.out.println("Número da agência: " + banco.agencia);
        System.out.println("Possui passe especial: " + banco.especial);
        System.out.println("limite: " + banco.limite);
        System.out.println("Saldo: " + banco.saldo);
    }
}
