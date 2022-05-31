package exercicio2;

public class CartaDeAtaque extends Carta{

    protected String poder;
    protected Integer resistencia;

    public CartaDeAtaque(String nome, Tipo tipo, int custo, String poder, Integer resistencia) {
        super(nome, tipo, custo);
        this.poder = poder;
        this.resistencia = resistencia;
    }

    public String verPoder(){
        return this.poder;
    }

    public Integer verResistencia(){
        return this.resistencia;
    }

}
