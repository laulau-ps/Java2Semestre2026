package faccat;

import java.util.Scanner;

public class Faccat_exer1_6_1 {
    public static void main(String[] args){
        Scanner coletaDados = new Scanner(System.in);

        // 6) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
        //área do retângulo.
        System.out.println("Programa Área Retângulo");

        System.out.println("Informe a base do retângulo:");
        float base = coletaDados.nextFloat();

        System.out.println("Informe a altura do retângulo:");
        float altura = coletaDados.nextFloat();

        float area = base * altura;

        System.out.println("A área do retângulo é = " + area);
    }
}
