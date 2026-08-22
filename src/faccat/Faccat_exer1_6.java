package faccat;

import java.util.Scanner;

public class Faccat_exer1_6 {
    public static void main(String[] args){
        Scanner coletaDados = new Scanner(System.in);

        // 6) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a
        //área do triângulo.
        System.out.println("Programa Área Triângulo");

        System.out.println("Informe a base do triângulo:");
        float base = coletaDados.nextFloat();

        System.out.println("Informe a altura do triângulo:");
        float altura = coletaDados.nextFloat();

        float area = base * altura / 2;

        System.out.println("A área do triângulo é = " + area);
    }
}
