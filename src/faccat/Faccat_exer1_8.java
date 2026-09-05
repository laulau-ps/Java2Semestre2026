package faccat;

import java.util.Scanner;

public class Faccat_exer1_8 {
    //8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
    //brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
    //de eleitores.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de Contagem de Votos");

        System.out.println("Informe o total de eleitores:");
        float totalEleitores = sc.nextFloat();

        System.out.println("Informe o total de votos brancos:");
        float votosBrancos = sc.nextFloat();

        System.out.println("Informe o total de votos nulos:");
        float votosNulos = sc.nextFloat();

        System.out.println("Informe o total de votos válidos:");
        float votosValidos = sc.nextFloat();

        float porcentagemVotosBrancos = votosBrancos / totalEleitores * 100;
        float porcentagemVotosNulos = votosNulos / totalEleitores * 100;
        float porcentagemVotosValidos = votosValidos / totalEleitores * 100;

        System.out.println("Porcentagem de votos brancos: " + String.format("%.2f", porcentagemVotosBrancos) + "%");
        System.out.println("Porcentagem de votos nulos: " + String.format("%.2f", porcentagemVotosNulos) + "%");
        System.out.println("Porcentagem de votos válidos: " + String.format("%.2f", porcentagemVotosValidos) + "%");

    }

}
