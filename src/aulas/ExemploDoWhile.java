package aulas;

public class ExemploDoWhile {
    static void main(String[] args) {
        int tentativa = 1;
        int maximo = 3;
        boolean sucesso;

        do{
            sucesso = tentativa == 2;
            System.out.println("Tentativa " + tentativa + ": " + sucesso);
            tentativa++;
        } while (!sucesso && tentativa <= maximo);
        //falso e falso > para
        // verdadeiro e verdadeiro > repete
        System.out.println("Processo encerrado");
    }
}
