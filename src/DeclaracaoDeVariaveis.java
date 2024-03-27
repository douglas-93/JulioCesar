public class DeclaracaoDeVariaveis {
    public static void main(String[] args) {
        /*
        * Declaração de Variáveis
        * Tipo do dado + nome da variável + ;
        */
        int numeroInteiro;
        double numeroComCasasDecimais;
        boolean verdadeiroOuFalso;
        String valorEmTexto;

        /*
        * Agora vamos atribuir um valor a essas variáveis
        */

        numeroInteiro = 10;
        numeroComCasasDecimais = 3.14;
        verdadeiroOuFalso = true;
        valorEmTexto = "Este valor deve sempre estar dentro de aspas duplas";

        /*
        * Comando para escrever na tela
        */
        System.out.println("Este comando escreve o que está dentro das aspas de forma literal");

        /*
        * Juntando texto com variáveis
        * Essa operação se chama concatenar, e consiste em juntar o texto com um valor de uma variável
        * Utilizamos o texto com o operador + e logo em seguida, chamamos a variável SEM UTILIZAR ASPAS
        */
        System.out.println("Número: " + numeroInteiro);
    }
}
