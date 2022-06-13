package exercicio3.Pagamento;

import exercicio3.Gerenciamento.ItemDeEstoque;
import exercicio3.Models.Produto;

import java.util.List;

public interface ICarrinho {

    void adicionarProduto(ItemDeEstoque itemDeEstoque);
    void removerProduto(ItemDeEstoque itemDeEstoque);
    void removerProduto(Long id);
    void limparCarrinho();
    List<ItemDeEstoque> getCarrinho();

}
