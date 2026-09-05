package aulas;

public class MetodosString {
    public static void main(String[] args){
        String texto = "abcdefghijklmnopqrstuvwxyz";

        //Tamanho da string
        System.out.println("Qtde de caracteres na variavel: " + texto.length());

        //converter para maiuscula (em minuscula é toLowerCase)
        System.out.println(texto.toUpperCase());

        //encontrar onde a partir de x posição a palavra-chave está dentro da variavel
        System.out.println(texto.indexOf("l"));

        //encontrar a partir da posição, qual o caractere presente
        System.out.println(texto.charAt(11));

        //comparação de strings
        String nome1 = "Laura";
        String nome2 = "laura";
        String nome3 = "Laura";

        System.out.println(nome1.equals(nome2)); //false
        System.out.println(nome1.equals(nome3)); //true

        //metodo de concatenar
        System.out.println(texto.concat(nome1));
    }
}
