package aulas;

public class ExMathJava {
    public static void main(String[] args) {

        //variaveis
        byte numero1 = 10;
        byte numero2 = 5;
        byte numero3 = 121;
        float numero4 = -3.45f;
        double numeroArredondamentoMaisProximo = 4.6d;
        double numeroArredondamentoAlto = 4.2d;
        double numeroArredondamentoBaixo = 4.9d;

        //métodos
        int numeroMaior = Math.max(numero1, numero2);
        int numeroMenor = Math.min(numero1, numero2);
        double raizQuadrada = Math.sqrt(numero3);
        int raizConvertida = (int) raizQuadrada;
        float numero4Absoluto = Math.abs(numero4);
        double potencia = Math.pow(2, 8);
        int potenciaConvertida = (int) potencia;
        double arredondamentoMaisProximo = Math.round(numeroArredondamentoMaisProximo);
        double arredondamentoAlto = Math.ceil(numeroArredondamentoAlto);
        double arredondamentoBaixo = Math.floor(numeroArredondamentoBaixo);
        double numerosAleatorios = Math.random();
        int numerosAleatoriosEmRangeInt = (int) (Math.random() * 101);

        //Exibe o maior número entre duas opções
        System.out.println("O maior número digitado é: " + numeroMaior);

        //Exibe o menor número entre duas opções
        System.out.println("O menor número digitado é: " + numeroMenor);

        //Exibe a raiz quadrada de um número
        System.out.println("A raiz quadrada de: " + numero3 + " é igual a: " + raizConvertida);

        //Converte o número negativo para positivo
        System.out.println("Número absoluto de: " + numero4 + " é: " + numero4Absoluto);

        //Exibe a potencia de um numero elevado a outro
        System.out.println("2^8: " + potenciaConvertida);

        //Arredondamentos
        System.out.println("Número " + numeroArredondamentoMaisProximo + "arredondado para o inteiro mais próximo: " + arredondamentoMaisProximo);
        System.out.println("Número " + numeroArredondamentoAlto + " arredondado para cima (mais alto): " + arredondamentoAlto);
        System.out.println("Número " + numeroArredondamentoBaixo + " arredondado para baixo (mais baixo): " + arredondamentoBaixo);

        //Gera numeros aleatorios
        System.out.println("Número completamente aleatorio: " + numerosAleatorios);
        System.out.println("Número aleatorio entre 0 e 100: " + numerosAleatoriosEmRangeInt);
    }
}
