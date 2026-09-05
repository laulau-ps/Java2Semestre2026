package aulas;

public class ExOperadorPosEPreIncremento {
    public static void main(String[] args){
        byte a = 10;
        System.out.println(a++); //exibe depois incrementa
        System.out.println(a); //exibe o valor atualizado (11)

        System.out.println(++a); //exibe o valor já incrementado
    }
}
