package faccat;

import java.util.Scanner;

public class Faccat_exer3_24 {
    //24) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
    //ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
    //ultrapassar este valor, calcular e escrever o seu salário total.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário fixo:");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite o valor total das vendas efetuadas:");
        double valorVendas = sc.nextDouble();

        double comissaoBase;
        double salarioFinal;

        if (valorVendas <= 1500.00){
            comissaoBase = valorVendas * 0.03;
            salarioFinal = salarioFixo + comissaoBase;
        } else{
            comissaoBase = 1500.00 * 0.03;
            double comissaoExtra = (valorVendas - 1500.00) * 0.05;
            salarioFinal = salarioFixo + comissaoBase + comissaoExtra;
        }

        System.out.println("Salário final: R$" + salarioFinal);
    }

}
