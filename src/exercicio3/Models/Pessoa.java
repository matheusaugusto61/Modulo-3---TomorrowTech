package exercicio3.Models;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private LocalDate dataDeNascimento;
    private Double carteira;

    public Pessoa(String nome, LocalDate dataDeNascimento, Double carteira) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.carteira = carteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void retirarDinheiro(Double dinheiro) {
        this.carteira-=dinheiro;
    }

    public void adicionarDinheiro(Double dinheiro) {
        this.carteira += carteira;
    }

    public double getCarteira(){
        return this.carteira;
    }
}
