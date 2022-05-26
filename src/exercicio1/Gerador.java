package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerador {

    public List<Double> gerarList(){
        Scanner input = new Scanner(System.in);
        ArrayList<Double>list = new ArrayList<>();
        while (true){
            System.out.println("Digite um numero: 0 para");
            double valor = input.nextDouble();
            if(valor==0){
                break;
            }else{
                list.add(valor);
            }
        }
        return list;
    }
}
