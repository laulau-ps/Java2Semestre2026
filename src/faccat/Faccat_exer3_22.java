package faccat;

import java.util.Scanner;

public class Faccat_exer3_22 {
    //22) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
    //de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
    //Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
    //o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
    //(considere que o mês possua 4 semanas exatas).

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas trabalhadas no mês:");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o salário por hora:");
        double salarioPorHora = sc.nextDouble();

        int maximoHorasPorMes = 4 * 40;
        double salarioFinal;

        if (horasTrabalhadas > maximoHorasPorMes){
            double salarioBase = maximoHorasPorMes * salarioPorHora;
            double salarioExtra = (horasTrabalhadas - maximoHorasPorMes) * salarioPorHora * 1.5;
            salarioFinal = salarioBase + salarioExtra;
        } else {
            salarioFinal = horasTrabalhadas * salarioPorHora;
        }

        System.out.println("Salário total: R$" + salarioFinal);
    }

}
