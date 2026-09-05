package faccat;

import java.util.Scanner;

public class Faccat_exer2_13 {
    //13) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
    //Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
    //final é: (n1 * 2 + n2 * 3 + n3 * 5) / 10

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Informe a 1ª nota do aluno:");
        float notaUm = sc.nextFloat();

        System.out.println("Informe a 2ª nota do aluno:");
        float notaDois = sc.nextFloat();

        System.out.println("Informe a 3ª nota do aluno:");
        float notaTres = sc.nextFloat();

        float mediaFinal = (notaUm * 2 + notaDois * 3 + notaTres * 5) / 10;

        System.out.println("A média final do aluno é igual a: " + String.format("%.2f", mediaFinal));
    }

}
