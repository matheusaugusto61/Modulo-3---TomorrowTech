package exercicio2;

public class CartaDeAtaqueEspecial extends CartaDeAtaque{

    public String efeitos;

    public CartaDeAtaqueEspecial(String nome, Tipo tipo, int custo, String poder, Integer resistencia) {
        super(nome, tipo, custo, poder, resistencia);
    }

    public String verEfeitos(){
        return this.efeitos;
    }

}
