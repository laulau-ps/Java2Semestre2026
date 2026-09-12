package aulas;

public class ExmeploWhile {
    static void main(String[] args) {
        String mensagem = "Não grita";
        int contador = 1;

        while (contador <= 5){
            System.out.println(mensagem);
            contador++; //soma o valor atual de contador + 1
        }
        // contador++ faz a condição evoluir até ficar falsa. Sem essa atualização, o loop seria infinito.
    }
}
