package exercicio3.Gerenciamento;

import exercicio3.Models.Produto;

public class ItemDeEstoque {

    protected Long id;
    protected static Long GeradorId=0l;
    protected Produto produto;

    public ItemDeEstoque(Produto produto) {
        this.id = GeradorId++;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ItemDeEstoque{" +
                "id=" + id +
                ", produto=" + produto +
                '}';
    }
}
