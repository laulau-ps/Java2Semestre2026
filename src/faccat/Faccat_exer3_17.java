package faccat;

import java.util.Scanner;

public class Faccat_exer3_17 {
    //17) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
    //uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
    //aluno é aprovado). Escrever também a média calculada.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota da 1ª avaliação:");
        double nota1aAvaliacao = sc.nextDouble();

        System.out.println("Digite a nota da 2ª avaliação:");
        double nota2aAvaliacao = sc.nextDouble();

        double media = (nota1aAvaliacao + nota2aAvaliacao) / 2;

        if (media >= 6){
            System.out.println("Média final: " + media + ". Aprovado");
        } else{
            System.out.println("Média final: " + media + ". Reprovado");
        }

    }

}
