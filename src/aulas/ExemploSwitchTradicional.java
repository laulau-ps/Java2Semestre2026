package aulas;

import java.util.Scanner;

public class ExemploSwitchTradicional {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número do mês do ano: ");
        int mes = sc.nextInt();

        switch (mes){
            case 1:
                System.out.println("Janeiro");
                //o break faz com que, ao retornar True no case, ele finaliza o switch, sem verificar os demais casos
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            default:
                System.out.println("Outro mês");
        }
    }
}
