package exercicio3.Models;

import java.util.List;

public class AlbumMusica extends Produto {

    protected String musicos;
    protected List<String> generos;
    protected List<String> selos;

    public AlbumMusica(String nome, Long id, Double preco, String musicos, List<String> generos, List<String> selos) {
        super(nome, id, preco);
        this.musicos = musicos;
        this.generos = generos;
        this.selos = selos;
    }

    public String getMusicos() {
        return musicos;
    }

    public void setMusicos(String musicos) {
        this.musicos = musicos;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public List<String> getSelos() {
        return selos;
    }

    public void setSelos(List<String> selos) {
        this.selos = selos;
    }
}
