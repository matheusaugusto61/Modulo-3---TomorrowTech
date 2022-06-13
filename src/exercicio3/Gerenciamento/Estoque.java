package exercicio3.Gerenciamento;

import exercicio3.Models.Produto;
import exercicio3.ObjectNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Estoque implements IEstoque {

     public ArrayList<ItemDeEstoque> produtos = new ArrayList<>();

     @Override
     public void adicionarProduto(Produto produto){
          produtos.add(new ItemDeEstoque(produto));
     }

     @Override
     public ItemDeEstoque retornarProduto(Long id){
          Optional<ItemDeEstoque> produto = produtos.stream()
                  .filter(p -> p.produto.getId() == id)
                  .findFirst();
          return produto.orElseThrow(() -> new ObjectNotFoundException(
                  "Produto não encontrado! id:" + id));
     }

     @Override
     public List<ItemDeEstoque> retornarProdutos(){
          List<ItemDeEstoque> listProdutos = produtos.stream()
                  .collect(Collectors.toList());
          return listProdutos;
     }

     @Override
     public void alterarProduto(Produto produto, Long id){
          produtos.stream()
                  .filter(p -> p.id==id)
                  .map(p -> p.produto = produto)
                  .close();
     }

     @Override
     public void removerProduto(Long id){
          produtos.removeIf(p -> p.id == id);
     }

     @Override
     public void removerProdutos(List<ItemDeEstoque> listProdutos) {
          for(ItemDeEstoque item: listProdutos) {
               produtos.removeIf(p -> p.id == item.getId());
          }
     }

     @Override
     public <T extends Produto> List<T> retornarProdutosPorCategoria() {
          return null;
     }


     /*public <T extends Produto> List<T> retornarProdutosPorCategoria(){
          List<Produto> listProdutos = produtos.stream()
                  .map(p -> p.produto)
                  .filter(p -> p instanceof T)
                  .collect(Collectors.toList());
          return listProdutos;
      */


     }



