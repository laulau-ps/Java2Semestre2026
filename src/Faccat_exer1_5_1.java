import java.util.Scanner;

public class Faccat_exer1_5_1 {
    public static void main(String[] args){

        Scanner coletaDados = new Scanner(System.in);

        // 5) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu sucessor.
        System.out.println("Programa Sucessor");

        System.out.printf("Informe um número:");
        int numero = coletaDados.nextInt();

        int sucessor = numero + 1;

        System.out.printf("O sucessor do número é = " + sucessor);
    }
}
