package faccat;

import java.util.Scanner;

public class Faccat_exer1_6_3 {
    public static void main(String[] args){
        Scanner coletaDados = new Scanner(System.in);

        // 6) Escreva um algoritmo para ler as dimensões, calcular e escrever a
        //área do losango.

        System.out.println("Programa Área Losango");

        System.out.println("Informe a diagonal maior do losango:");
        double diagonalMaior = coletaDados.nextDouble();

        System.out.println("Informe a diagonal menor do losango:");
        double diagonalMenor = coletaDados.nextDouble();

        double area = diagonalMaior * diagonalMenor / 2;

        System.out.println("A área do losango é = " + area);

        coletaDados.close();
    }
}
