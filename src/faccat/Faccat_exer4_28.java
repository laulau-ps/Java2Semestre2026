package faccat;

import java.util.Scanner;

public class Faccat_exer4_28 {
    //28) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();

        System.out.println("Digite o terceiro número:");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("Maior número: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("Maior número: " + numero2);
        } else {
            System.out.println("Maior número: " + numero3);
        }
    }
}
