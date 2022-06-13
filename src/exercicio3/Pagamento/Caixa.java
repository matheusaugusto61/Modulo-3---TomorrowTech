package exercicio3.Pagamento;

import exercicio3.Models.Pessoa;

import java.util.Optional;

public class Caixa implements ICaixa{

    private Double dinheiro;

    public Caixa() {
        this.dinheiro = 0d;
    }

    @Override
    public boolean finalizarCompra(ICarrinho carrinho, Pessoa pessoa) {
        double valorCompra = calcularCarrinho(carrinho);
        if(pessoaTemDinheiro(pessoa, valorCompra)){
            this.dinheiro += valorCompra;
            pessoa.retirarDinheiro(valorCompra);
            carrinho.limparCarrinho();
            return true;
        }
        return false;
    }

    @Override
    public Double calcularCarrinho(ICarrinho carrinho) {
        Optional<Double> valorFinal = carrinho.getCarrinho().stream()
                .map(p -> p.getProduto().getPreco())
                .reduce((n1, n2) -> n1 + n2);
        return valorFinal.orElse(0d);
    }

    private boolean pessoaTemDinheiro(Pessoa pessoa, Double valorCompra){
        if(pessoa.getCarteira() >= valorCompra){
            return true;
        }
        return false;
    }
}
