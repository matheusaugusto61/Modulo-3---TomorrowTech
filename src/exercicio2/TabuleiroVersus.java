package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroVersus implements Tabuleiro {

    private int contadorDecks = 0;
    private Carta[][] tabuleiro = new Carta[2][7];
    private Player [] players = new Player[2];
    private List<List<Carta>> decks = new ArrayList<>();
    private int jogador;


    @Override
    public void inserirDeck(List<Carta> deck) {
        if (verificaNumeroJogadores() && deck.size()<=50) {
            this.decks.add(contadorDecks, deck);
            contadorDecks++;
        }
    }

    @Override
    public boolean verificaJogadaCartaAtaque(Carta carta) {
        int contadorCartaAtaqueEspecial = 0;
        int contadorCartaAtaque = 0;
        if (carta instanceof CartaDeAtaqueEspecial) {
            for (int i = 0; i < tabuleiro[i].length; i++) {
                if (tabuleiro[jogador][i] instanceof CartaDeAtaqueEspecial) {
                    contadorCartaAtaqueEspecial++;
                }
            }
            if (contadorCartaAtaqueEspecial > 2) {
                return false;
            }
            return true;
        } else if (carta instanceof CartaDeAtaque) {
            for (int i = 0; i < tabuleiro[i].length; i++) {
                if (tabuleiro[jogador][i] instanceof CartaDeAtaque) {
                    contadorCartaAtaque++;
                }
            }
            if (contadorCartaAtaque > 5) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean jogadorVenceu(Player adversario) {
        if (adversario.getVida() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean verificaNumeroJogadores() {
        if (this.contadorDecks < 2) {
            return true;
        }
        return false;
    }

    public void invocaCarta(Carta carta) {
        if (verificaJogadaCartaAtaque(carta)) {
            this.tabuleiro[jogador][proximaPosicaoTabuleiro()] = carta;
            this.decks.get(jogador).remove(carta);
        }
    }

    public void mudaTurno() {
        if (this.jogador == 1) {
            this.jogador = 0;
        } else {
            this.jogador = 1;
        }
    }

    public int proximaPosicaoTabuleiro() {
        for (int i = 0; i < this.tabuleiro[jogador].length; i++) {
            if (this.tabuleiro[jogador][i] == null) {
                return i;
            }
        }
        return -1;
    }

}
