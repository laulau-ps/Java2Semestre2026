package faccat;

import java.util.Scanner;

public class Faccat_exer3_18 {
    //18) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
    //poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento:");
        int anoNascimento = sc.nextInt();

        System.out.println("Informe o ano atual:");
        int anoAtual = sc.nextInt();

        if (anoAtual - anoNascimento >=16){
            System.out.println("Poderá votar esse ano.");
        } else{
            System.out.println("Não poderá votar esse ano.");
        }
    }

}
