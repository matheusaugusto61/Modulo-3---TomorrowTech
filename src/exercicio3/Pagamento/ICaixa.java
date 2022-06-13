package exercicio3.Pagamento;

import exercicio3.Models.Pessoa;

public interface ICaixa {

    boolean finalizarCompra(ICarrinho carrinho, Pessoa pessoa);
    Double calcularCarrinho(ICarrinho carrinho);
}
