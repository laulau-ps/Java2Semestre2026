package aulas;

public class ExemploWhile2 {
    static void main(String[] args) {
        int meta = 100;
        int produzido = 0;
        int producaoPorCiclo = 18;
        int ciclo = 1;

        while (produzido < meta){
            produzido += producaoPorCiclo;
            if (produzido > meta){
                produzido = meta;
            }
            System.out.println("Ciclo " + ciclo + " -> produzido: " + produzido);
        }

        System.out.println("Meta de produção atingida");
    }
}
