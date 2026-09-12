package aulas;

public class ExemploOperadorTernario {
    static void main(String[] args) {
        double valorTotal = 220.0d;
        // se (?) valor total maior ou igual a 200, então 0.0 senão (:) 25.0
        double frete = valorTotal >= 200.0 ? 0.0 : 25.0;

        String mensagem = frete == 0.0 ? "Frete grátis" : "Frete: R$" + frete;

        System.out.println(mensagem);

        int idade = 17;

        String mensagem2 = idade < 16 ? "Não pode votar" : idade < 18 ? "Voto opcional" : "Voto obrigatório";

        System.out.println(mensagem2);
    }
}
