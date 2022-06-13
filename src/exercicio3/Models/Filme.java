package exercicio3.Models;

import java.util.List;

public class Filme extends Produto {

    protected String estudio;
    protected List<String> diretores;
    protected List<String> generos;
    protected List<String> produtores;

    public Filme(String nome, Long id, Double preco, String estudio, List<String> diretores, List<String> generos, List<String> produtores) {
        super(nome, id, preco);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public List<String> getDiretores() {
        return diretores;
    }

    public void setDiretores(List<String> diretores) {
        this.diretores = diretores;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public List<String> getProdutores() {
        return produtores;
    }

    public void setProdutores(List<String> produtores) {
        this.produtores = produtores;
    }
}
