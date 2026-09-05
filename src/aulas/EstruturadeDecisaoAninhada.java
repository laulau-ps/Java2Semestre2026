package aulas;

public class EstruturadeDecisaoAninhada {
    public static void main(String[] args){

        int idade = 16;

        if(idade > 18){
            System.out.println("Liberado");
        }
        else if(idade >15){
            System.out.println("Pode entrar acompanhado");
        }
        else {
            System.out.println("Não pode entrar");
        }
    }
}
