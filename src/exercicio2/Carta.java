package exercicio2;

public abstract class Carta {

    protected String nome;
    protected Tipo tipo;
    protected int custo;

    public Carta(String nome, Tipo tipo, int custo) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
    }

    public String nomeCarta() {
        return nome;
    }

    public Tipo tipoCarta() {
        return tipo;
    }


    public int custoCarta() {
        return custo;
    }

}
