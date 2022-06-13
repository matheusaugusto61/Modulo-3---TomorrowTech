package exercicio3.Gerenciamento;

import exercicio3.Models.Produto;

import java.util.List;

public interface IEstoque {

    void adicionarProduto(Produto produto);
    ItemDeEstoque retornarProduto(Long id);
    List<ItemDeEstoque> retornarProdutos();
    void alterarProduto(Produto produto, Long id);
    void removerProduto(Long id);
    void removerProdutos(List<ItemDeEstoque> listProdutos);
    <T extends Produto> List<T> retornarProdutosPorCategoria();
}
