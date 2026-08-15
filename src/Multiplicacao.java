import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args){
        Scanner coletaDados = new Scanner(System.in);

        System.out.println("Programa Multiplicação");

        System.out.println("Informe o primeiro número:");
        float primeiroNumero = coletaDados.nextInt();

        System.out.println("Informe o segundo número:");
        float segundoNumero = coletaDados.nextInt();

        float multiplicacao = primeiroNumero * segundoNumero;
        System.out.println("A multiplicação dos números é = " + multiplicacao);
    }
}
