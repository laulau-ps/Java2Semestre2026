package faccat;

import java.util.Scanner;

public class Faccat_exer3_25 {
    //25) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
    //escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
    //ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da sua conta:");
        int numeroConta = sc.nextInt();

        System.out.println("Digite seu saldo:");
        double saldo = sc.nextDouble();

        System.out.println("Digite seu débito (valor que saiu da conta):");
        double debito = sc.nextDouble();

        System.out.println("Digite seu crédito (valor que entrou na conta):");
        double credito = sc.nextDouble();

        double saldoAtual = saldo - debito + credito;

        if (saldoAtual > 0){
            System.out.println("Saldo atual: R$" + saldoAtual + ". Positivo");
        } else {
            System.out.println("Saldo atual: R$" + saldoAtual + ". Negativo");
        }
    }

}
