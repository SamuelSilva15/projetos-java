package ImpostoRenda;

import BancoNew.Cliente;

public class ReceitaFederal {
    Contribuinte contribuintes [] = new Contribuinte[6];
    int ultimoAlunoAdicionado = 0;
    int NUMERO_MAXIMO_DE_CLIENTES = 6;

    public void addContribuinte (Contribuinte contribuinte){
         if (this.contribuintes == null) {
            this.contribuintes = new Contribuinte[NUMERO_MAXIMO_DE_CLIENTES];
        }
        this.contribuintes[ultimoAlunoAdicionado++] = contribuinte;
    }

    double novovalor = 0;
    public double PessoaJuridica (double valor) {
       return novovalor =  valor / 10;
    }

    public double PessoaFisica (double valor) {
        if(valor > 0 && valor  < 1400){
            novovalor = 0;
        }
        else if (valor > 1400 && valor < 2100){
            novovalor = valor / 10;
        }
        else if (valor > 2100 && valor < 2800){
            novovalor = valor / 15;
        }
        else if (valor > 2800 && valor < 3600){
            novovalor = valor / 20;
        }
        else if (valor > 3600 ){
            novovalor = valor / 30;
        }
       return novovalor;
    }
}
