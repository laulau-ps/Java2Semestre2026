package aulas;

public class ExercicioTypeCasting {
    public static void main(String[] args){
        int pontuacaoMax = 500;
        int pontuacaoUser = 423;

        double porcentagemPontuacao = (double) pontuacaoUser / pontuacaoMax * 100.0d;

        System.out.println("Porcentagem da Pontuação: " + porcentagemPontuacao);
    }
}
