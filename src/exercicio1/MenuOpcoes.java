package exercicio1;

import java.util.Scanner;

public class MenuOpcoes {

    public int opcoes(){
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Soma\n2- Subtração\n3- Multiplicação\n4- Divisão\n5- Sair");
        int i = input.nextInt();
        return i;
    }
}
