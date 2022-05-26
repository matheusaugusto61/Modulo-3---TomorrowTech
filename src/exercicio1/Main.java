package exercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(5d);
        list.add(2d);

        Calculo subtracao = new Subtracao();
        System.out.println(subtracao.calculo(list));
        Calculo divisao = new Divisao();
        System.out.println(divisao.calculo(list));
        Calculo multiplicacao = new Multiplicacao();
        System.out.println(multiplicacao.calculo(list));
        Calculo soma = new Soma();
        System.out.println(soma.calculo(list));
    }
}
