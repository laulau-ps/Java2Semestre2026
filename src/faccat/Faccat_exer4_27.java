package faccat;

import java.util.Scanner;

public class Faccat_exer4_27 {
    //27) Ler um valor e escrever se é positivo, negativo ou zero.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        if(numero > 0){
            System.out.println("Positivo");
        } else if(numero < 0){
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }

}
