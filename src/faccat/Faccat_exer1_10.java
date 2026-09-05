package faccat;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Faccat_exer1_10 {
    //10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
    //distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
    //seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
    //calcular e escrever o custo final ao consumidor.

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Programa Custo Final de Carro");

        System.out.println("Informe o custo de fábrica do carro:");
        float custoFabrica = sc.nextFloat();

        float percentualDistribuidor = 0.28f;
        float impostos = 0.45f;

        float custoFinal = (custoFabrica * percentualDistribuidor + custoFabrica * impostos + custoFabrica);

        System.out.println("O custo final ao consumidor será de: R$" + String.format("%.2f",custoFinal));
    }

}
