import java.util.Scanner;
public class Divisao {
    public static void main(String[] args) {
        System.out.println("Programa Divisão");

        Scanner coletaDados = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        float primeiroNumero = coletaDados.nextFloat();

        System.out.println("Informe o segundo número:");
        float segundoNumero = coletaDados.nextFloat();

        float divisao = primeiroNumero / segundoNumero;

        System.out.println("A divisão dos números é = " + divisao);

    }
}
