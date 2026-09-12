package aulas;

import java.util.Scanner;

public class ExemploIfTernarioDiasSemana {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia da semana (1 = domingo, 2 = segunda-feira, etc): ");
        int diaSemana = sc.nextInt();

        String diaInformado = diaSemana == 1 ? "Domingo" : diaSemana == 2 ? "Segunda-feira" : diaSemana == 3 ? "Terça-feira" : diaSemana == 4 ? "Quarta-feira" : diaSemana == 5 ? "Quinta-feira" : diaSemana == 6 ? "Sexta-feira" : diaSemana == 7 ? "Sábado" : "Dia não correspondente";

        System.out.println(diaInformado);
    }
}