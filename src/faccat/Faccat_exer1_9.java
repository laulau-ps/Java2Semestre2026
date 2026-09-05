package faccat;

import java.util.Scanner;

public class Faccat_exer1_9 {
    //9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
    //Calcular e escrever o valor do novo salário.

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Programa Reajuste Salarial");

        System.out.println("Informe seu salário mensal atual:");
        float salarioAtual = sc.nextFloat();

        System.out.println("Informe o percentual de reajuste (Ex: 10, 20, 50):");
        float percentualReajuste = sc.nextFloat();

        float novoSalario = salarioAtual * (1 + percentualReajuste/100);

        System.out.println("Seu novo salário com o reajuste será de: R$" + String.format("%.2f", novoSalario));

    }

}
