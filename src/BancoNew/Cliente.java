package BancoNew;

import br.com.samuel.curso.Aluno;

public class Cliente {
    private final String nome;
    private final ContaBancaria contaBancaria;;

    public Cliente (String nome, int numConta){
        this.nome = nome;
        this.contaBancaria = new ContaBancaria(numConta);

    }

    public String getNome() {
        return nome;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }
}
