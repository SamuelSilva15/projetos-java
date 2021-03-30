package BancoNew;

import br.com.samuel.curso.Aluno;

public class Cliente {
    private final String nome;
    private final ContaBancaria contaBancaria;
    ContaBancaria.ContaEspecial.ContaPoupanca poupanca = new ContaBancaria.ContaEspecial.ContaPoupanca();

    public Cliente (String nome, int numConta, double limite){
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
