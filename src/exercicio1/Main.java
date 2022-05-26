package exercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MenuOpcoes menuOpcoes = new MenuOpcoes();
        Gerador gerador = new Gerador();
        loop:while (true) {
            int opcao = menuOpcoes.opcoes();
            if(opcao==5){
                break;
            }
            List<Double> list = gerador.gerarList();
            switch (opcao) {
                case 1:
                    Calculo soma = new Soma();
                    System.out.println(soma.calculo(list));
                    break;
                case 2:
                    Calculo subtracao = new Subtracao();
                    System.out.println(subtracao.calculo(list));
                    break;
                case 3:
                    Calculo multiplicacao = new Multiplicacao();
                    System.out.println(multiplicacao.calculo(list));
                    break;
                case 4:
                    Calculo divisao = new Divisao();
                    System.out.println(divisao.calculo(list));
                    break;
                case 5:
                    System.out.println("Até mais");
                    break loop;
            }
        }
    }
}
