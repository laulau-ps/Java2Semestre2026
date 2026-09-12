package faccat;

import java.util.Scanner;

public class Faccat_exer4_31 {
    //31) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
    //ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
    //dos outros 2 lados.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a medida do lado A:");
        int ladoA = sc.nextInt();

        System.out.println("Digite a medida do lado B:");
        int ladoB = sc.nextInt();

        System.out.println("Digite a medida do lado C:");
        int ladoC = sc.nextInt();

        if (ladoA + ladoB > ladoC) {
            if (ladoB + ladoC > ladoA) {
                if (ladoA + ladoC > ladoB){
                    System.out.println("Forma um triângulo");
                }
            }
        } else {
            System.out.println("Não forma um triângulo");
        }
    }
}
