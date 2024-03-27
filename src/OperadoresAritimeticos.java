public class OperadoresAritimeticos {
    public static void main(String[] args) {
        /*
        * Os operadores aritiméticos seguem o padrão da calculadora o qual estamos acostumados
        */

        int n1 = 10;
        int n2 = 3;

        int soma = n1 + n2;
        System.out.println(soma);

        int subtracao = n1 - n2;
        System.out.println(subtracao);

        int multiplicacao = n1 * n2;
        System.out.println(multiplicacao);

        /*
        * Podemos perceber algo singular nessa operação abaixo. Vemos que as casas decimais não são exibidas
        * Isso acontece porque o resultado da divisão de dois números inteiros é sempre um número inteiro.
        * Isso ocorre porque o Java realiza uma divisão inteira, descartando qualquer parte decimal do resultado.
        */
        int divisao = n1 / n2;
        System.out.println(divisao);

        /*
        * Para mostrar as casas decimais, você precisa converter um ou ambos os números para um tipo de dado
        * que suporte casas decimais, como double
        */
        double n3 = 3.0;
        double divisaoDouble = n1 / n3;
        System.out.println(divisaoDouble);
    }
}
