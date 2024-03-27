import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        /*
        *   Declaração responsável por "importar" as funções que utilizaremos
        */
        Scanner sc = new Scanner(System.in);

        /*
        * Leitura de um número inteiro
        */
        int numeroInteiro = sc.nextInt();

        /*
         * Leitura de um número com casas decimais
         */
        double numeroReal = sc.nextDouble();

        /*
         * Leitura de dados em formato de texto (String)
         */
        String texto = sc.nextLine();
    }
}
