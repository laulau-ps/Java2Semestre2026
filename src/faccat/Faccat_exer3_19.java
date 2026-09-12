package faccat;

import java.util.Scanner;

public class Faccat_exer3_19 {
    //19) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();

        int maiorNumero = Math.max(numero1, numero2);

        System.out.println("Maior número: " + maiorNumero);

    }

}
