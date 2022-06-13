package exercicio3.Models;

public class Brinquedo extends Produto {

    protected String tipo;

    public Brinquedo(String nome, Long id, Double preco, String tipo) {
        super(nome, id, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
