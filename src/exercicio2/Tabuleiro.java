package exercicio2;

import java.util.List;

public interface Tabuleiro {

    void inserirDeck(List<Carta> deck);
    boolean verificaJogadaCartaAtaque(Carta carta);
    boolean jogadorVenceu(Player player);
    boolean verificaNumeroJogadores();
    void mudaTurno();
    void invocaCarta(Carta carta);
}
