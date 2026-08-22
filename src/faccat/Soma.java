package faccat;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args){

        // chama o Scanner com o nome a ser usado neste arquivo, define como um novo scanner que usará o metodo System.in
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa faccat.Soma");
        System.out.println("Digite o primeiro número:");

                            //metodo scanner que pega o proximo numero inteiro que o usuario digitar
        int primeiroNumero = entradaDados.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = entradaDados.nextInt();

        int soma = primeiroNumero + segundoNumero;

        System.out.println("A soma entre os números é = " + soma);
    }
}
