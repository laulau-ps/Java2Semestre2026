package faccat;

import java.util.Scanner;

public class Faccat_exer3_26 {
    //26) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
    //quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
    //média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
    //a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
    //compra'.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade atual em estoque do produto:");
        int qtdeAtual = sc.nextInt();

        System.out.println("Digite o estoque máximo do produto:");
        int qtdeMaxima = sc.nextInt();

        System.out.println("Digite o estoque mínimo do produto:");
        int qtdeMinima = sc.nextInt();

        double qtdeMedia = (qtdeMaxima + qtdeMinima) / 2.0;

        if (qtdeAtual >= qtdeMedia){
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }

}
