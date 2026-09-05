package aulas;

public class ExNarrowingCasting {
public static void main(String[] args){

    double numeroDouble = 10.72d;
    int numero = (int) numeroDouble;

    System.out.println("O numero inteiro é: " + numero);

    System.out.println("O numero double é: " + numeroDouble);
}
}
