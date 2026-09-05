package faccat;

import java.util.Scanner;

public class Faccat_exer1_11 {
    //11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
    //mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
    //efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
    //vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
    //vendedor.

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de carros vendidos: ");
        int qtdeCarros = sc.nextInt();

        System.out.println("Informe o valor total de suas vendas:");
        float totalvendas = sc.nextFloat();

        System.out.println("Informe seu salário fixo:");
        float salarioFixo = sc.nextFloat();

        System.out.println("Informe o valor recebido por carro vendido:");
        float valorPorCarro = sc.nextFloat();

        float comissaoCarroVendido = valorPorCarro * qtdeCarros;
        float comissaoVendas = totalvendas * 0.05f;
        float valorTotal = comissaoCarroVendido + comissaoVendas + salarioFixo;

        System.out.println("Seu salário final é = R$" + String.format("%.2f", valorTotal));

    }

}
