package BancoNew;

import br.com.samuel.curso.Aluno;

public class Banco {
    int ultimoAlunoAdicionado = 0;
    Cliente clientes [] = new Cliente[5];
    int NUMERO_MAXIMO_DE_CLIENTES = 5;

    public void addcliente (Cliente cliente){
        if (this.clientes == null) {
            this.clientes = new Cliente[NUMERO_MAXIMO_DE_CLIENTES];
        }
        this.clientes[ultimoAlunoAdicionado++] = cliente;

    }

    public Cliente procuraCliente (int numero_conta) {
        for (int i = 0; i < clientes.length; i++) {
            if (numero_conta == clientes[i].getContaBancaria().getNumeroConta()) {
                return clientes[i];
            }
        }
        return null;
    }

}

