package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroParty implements Tabuleiro{

    private int contadorDecks = 0;
    private Carta[] tabuleiro = new Carta[34];
    private Player[] players = new Player[5];
    private List<List<Carta>> decks = new ArrayList<>();
    private int jogador;

    @Override
    public void inserirDeck(List<Carta> deck) {
        if (verificaNumeroJogadores() && deck.size()<=80) {
            this.decks.add(contadorDecks, deck);
            contadorDecks++;
        }
    }

    @Override
    public boolean verificaJogadaCartaAtaque(Carta carta) {
            for (int i = 0; i < tabuleiro.length; i++) {
                if (tabuleiro[i]==null) {
                    return true;
                }
            }
        return false;
    }

    @Override
    public boolean jogadorVenceu(Player player) {
        for (int i = 0; i < players.length; i++) {
            if(players[i].getVida()>0 && i!=jogador){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean verificaNumeroJogadores() {
        if (this.contadorDecks < 5) {
            return true;
        }
        return false;
    }

    @Override
    public void mudaTurno() {
        if(this.jogador<4){
            this.jogador++;
        }else{
            this.jogador=0;
        }
    }

    @Override
    public void invocaCarta(Carta carta) {
        if (verificaJogadaCartaAtaque(carta)) {
            this.tabuleiro[proximaPosicaoTabuleiro()] = carta;
            this.decks.get(jogador).remove(carta);
        }
    }

    public int proximaPosicaoTabuleiro() {
        for (int i = 0; i < this.tabuleiro.length; i++) {
            if (this.tabuleiro[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
