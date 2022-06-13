package exercicio3.Models;

import java.util.List;

public class Livro extends Produto {

    protected List<String> generos;
    protected String escritor;
    protected String editora;

    public Livro(String nome, Long id, Double preco, List<String> generos, String escritor, String editora) {
        super(nome, id, preco);
        this.generos = generos;
        this.escritor = escritor;
        this.editora = editora;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
