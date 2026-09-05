package faccat;

import java.util.Scanner;

public class Faccat_exer2_12 {
    //12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
    //correspondente em graus

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Fahrenheit:");
        float grausFahrenheit = sc.nextFloat();

        float conversao = (grausFahrenheit - 32) * 5/9;

        System.out.println(grausFahrenheit + "Fº = " + conversao + "Cº");

    }

}
