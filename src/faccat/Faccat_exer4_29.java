package faccat;

import java.util.Scanner;

public class Faccat_exer4_29 {
    //29) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
    //maiores.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();

        System.out.println("Digite o terceiro número:");
        int numero3 = sc.nextInt();

        int soma;

        if (numero1 > numero2 && numero2 > numero3){
            soma = numero1 + numero2;
        } else if(numero1 > numero2 && numero3 > numero2){
            soma = numero1 + numero3;
        } else{
            soma = numero2 + numero3;
        }

        System.out.println("Soma dos maiores números: " + soma);
    }
}
