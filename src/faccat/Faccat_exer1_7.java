package faccat;

import java.util.Scanner;

public class Faccat_exer1_7 {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        /* 7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */
        System.out.println("Programa exibir idade em dias");
        System.out.println("Informe sua idade:");
        int idade = entradaDados.nextInt();

        System.out.println("A quantos meses foi seu último aniversário?: ");
        int ultimoAniversario = entradaDados.nextInt();

        System.out.println("Passaram-se quantos dias desde seu último mesversario?: ");
        int diasMesversario = entradaDados.nextInt();

        int idadeEmDias = idade * 365 + (ultimoAniversario * 30) + diasMesversario;

        System.out.println("Sua idade em dias: " + idadeEmDias);

    }
}
