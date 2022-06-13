package exercicio3.Sistema;

import exercicio3.Gerenciamento.Estoque;
import exercicio3.Models.Brinquedo;
import exercicio3.Models.Livro;
import exercicio3.Models.Pessoa;
import exercicio3.Models.Produto;
import exercicio3.Pagamento.Caixa;
import exercicio3.Pagamento.Carrinho;

import java.time.LocalDate;

public class Livraria {

    public static void main(String[] args) {
        Pessoa matheus = new Pessoa("Matheus", LocalDate.of(2000,07,06), 200d);
        Brinquedo carrinho = new Brinquedo("civic g8", 1l, 50d, "carrinho");
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(carrinho);
        System.out.println(estoque.produtos);
        Carrinho carrinhoDeCompras = new Carrinho(matheus, estoque);
        carrinhoDeCompras.adicionarProduto(estoque.retornarProduto(1l));
        Caixa caixa = new Caixa();
        caixa.finalizarCompra(carrinhoDeCompras, matheus);
    }
}
