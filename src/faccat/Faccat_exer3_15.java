package faccat;

import java.util.Scanner;

public class Faccat_exer3_15 {
    //15) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("Positivo");
        } else{
            System.out.println("Negativo");
        }
    }

}
