package faccat;

import java.util.Scanner;

public class Faccat_exer4_32 {
    //32) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
    //do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do 1º time:");
        String primeiroTime = sc.nextLine();

        System.out.println("Digite o nome do 2º time:");
        String segundoTime = sc.nextLine();

        System.out.println("Digite a quantidade de gols que o " + primeiroTime + " fez:");
        int qtdeGolsTime1 = sc.nextInt();

        System.out.println("Digite a quantidade de gols que o " + segundoTime + " fez:");
        int qtdeGolsTime2 = sc.nextInt();


        if (qtdeGolsTime1 > qtdeGolsTime2) {
            System.out.println("Vencedor: " + primeiroTime);
        } else if (qtdeGolsTime2 > qtdeGolsTime1) {
            System.out.println("Vencedor: " + segundoTime);
        } else {
            System.out.println("Empate");
        }
    }
}
