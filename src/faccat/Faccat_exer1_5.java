package faccat;

import java.util.Scanner;

public class Faccat_exer1_5 {
    public static void main(String[] args){

        Scanner coletaDados = new Scanner(System.in);

        // 5) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
        System.out.println("Programa Antecessor");

        System.out.printf("Informe um número:");
        int numero = coletaDados.nextInt();

        int antecessor = numero - 1;

        System.out.printf("O antecessor do número é = " + antecessor);
    }
}
