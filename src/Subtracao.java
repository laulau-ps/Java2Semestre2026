import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args){
        System.out.println("Programa Subtração");

        Scanner coletaDados = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int primeiroNumero = coletaDados.nextInt();

        System.out.println("Informe o segundo número:");
        int segundoNumero = coletaDados.nextInt();

        int subtracao = primeiroNumero - segundoNumero;

        System.out.println("A subtração desses números é = " + subtracao);

    }
}
