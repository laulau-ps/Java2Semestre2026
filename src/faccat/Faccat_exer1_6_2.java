package faccat;

import java.util.Scanner;

public class Faccat_exer1_6_2 {
    public static void main(String[] args){
        Scanner coletaDados = new Scanner(System.in);

        // 6) Escreva um algoritmo para ler as dimensões, calcular e escrever a
        //área do circulo.

        System.out.println("Programa Área Círculo");

        System.out.println("Informe o raio do círculo:");
        double raio = coletaDados.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é = " + area);

        coletaDados.close();
    }
}
