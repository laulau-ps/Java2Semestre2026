package aulas;

public class ExemploFor {
    static void main(String[] args) {
        double[] vendas = {120.0, 340.5, 89.9, 410.0};
        double total = 0.0;

        //para i igual a 0, enquanto i menor que o comprimento do array vendas, i++
        for (int i = 0; i < vendas.length; i++){
            total += vendas[i];
        }
        System.out.println("Total vendido: R$" + total);
    }
}
