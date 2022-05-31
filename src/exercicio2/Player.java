package exercicio2;

public class Player {

    private int vida;

    public int getVida(){
        return this.vida;
    }

    public void diminuiVida(int valor){
        this.vida -= valor;
        if(this.vida<0){
            this.vida=0;
        }
    }
}
