package faccat;

import java.util.Scanner;

public class Faccat_exer3_16 {
    //16) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
    //compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
    //escreva o custo total da compra.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de maçãs compradas:");
        int qtdeMacas = sc.nextInt();

        double valor;

        if (qtdeMacas < 12){
            valor = qtdeMacas * 1.30d;
        } else{
            valor = qtdeMacas;
        }

        System.out.println("Custo total da compra: R$" + valor);
    }

}
