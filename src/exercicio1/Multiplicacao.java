package exercicio1;

import java.util.List;
import java.util.Optional;

public class Multiplicacao implements Calculo {

    @Override
    public double calculo(List<Double> list) {
        Optional<Double> result = list.stream()
                .reduce((subtotal, element) -> subtotal * element);
        return result.orElse(null);
    }
}
