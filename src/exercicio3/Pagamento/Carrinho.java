package exercicio3.Pagamento;

import exercicio3.Gerenciamento.Estoque;
import exercicio3.Gerenciamento.ItemDeEstoque;
import exercicio3.Models.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Carrinho implements ICarrinho{

    private ArrayList<ItemDeEstoque> produtos = new ArrayList<>();
    private Pessoa pessoa;
    private Estoque estoque;

    public Carrinho(Pessoa pessoa, Estoque estoque){
        this.pessoa = pessoa;
        this.estoque = estoque;
    }

    @Override
    public void adicionarProduto(ItemDeEstoque itemDeEstoque) {
        produtos.add(itemDeEstoque);
    }

    @Override
    public void removerProduto(ItemDeEstoque itemDeEstoque) {
        produtos.removeIf(p -> p.equals(itemDeEstoque));
    }

    @Override
    public void removerProduto(Long id) {
        produtos.removeIf(p -> p.getId() == id);
    }

    @Override
    public void limparCarrinho(){
        this.estoque.removerProdutos(produtos);
        this.produtos.removeAll(produtos);
    }

    @Override
    public List<ItemDeEstoque> getCarrinho() {
        return produtos;
    }


}
