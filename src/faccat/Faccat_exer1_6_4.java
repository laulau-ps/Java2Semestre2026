package faccat;

import java.util.Scanner;

public class Faccat_exer1_6_4 {
    public static void main(String[] args){
        Scanner coletaDados = new Scanner(System.in);

        // 6) Escreva um algoritmo para ler as dimensões, calcular e escrever a
        //área do trapezio.

        System.out.println("Programa Área Trapézio");

        System.out.println("Informe a base maior do trapézio:");
        double baseMaior = coletaDados.nextDouble();

        System.out.println("Informe a base menor do trapézio:");
        double baseMenor = coletaDados.nextDouble();

        System.out.println("Informe a altura do trapézio:");
        double alturaTrapezio = coletaDados.nextDouble();

        double area = (baseMaior + baseMenor) * alturaTrapezio / 2;

        System.out.println("A área do trapézio é = " + area);

        coletaDados.close();
    }
}
