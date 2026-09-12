package faccat;

import java.util.Scanner;

public class Faccat_exer3_21 {
    //21) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
    //minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
    //de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora (sem os minutos) do início do jogo de xadrez:");
        int horaInicio = sc.nextInt();

        System.out.println("Digite a hora (sem os minutos) do fim do jogo de xadrez:");
        int horaFim = sc.nextInt();

        int duracaoJogo;

        if (horaInicio < horaFim){
            duracaoJogo = horaFim - horaInicio;
        } else {
            duracaoJogo = horaFim - horaInicio + 24;
        }

        System.out.println("A partida durou: " + duracaoJogo + "h");
    }

}
