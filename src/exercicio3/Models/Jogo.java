package exercicio3.Models;

public class Jogo extends Produto {

    protected String Distribuidora;
    protected String genero;
    protected String studio;

    public Jogo(String nome, Long id, Double preco, String distribuidora, String genero, String studio) {
        super(nome, id, preco);
        Distribuidora = distribuidora;
        this.genero = genero;
        this.studio = studio;
    }

    public String getDistribuidora() {
        return Distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        Distribuidora = distribuidora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
