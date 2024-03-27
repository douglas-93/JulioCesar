public class CondicionaisOperadoresDeComparacao {
    public static void main(String[] args) {
        /*
        * Exemplo 1: Estrutura `if` simples com operador primeiro
        */

        int idade = 18;

        if (idade >= 18) {
            /*
            * Este bloco de código será executado se a idade for maior ou igual a 18
            */
            System.out.println("Você é maior de idade!");
        } else {
            /*
            * Este bloco de código será executado se a idade for menor que 18
            */
            System.out.println("Você é menor de idade!");
        }

        /*
        * Exemplo 2: Estrutura `else if` com operador primeiro
        */

        int nota = 80;

        if (nota >= 90) {
            // A nota é A
            System.out.println("Você tirou A!");
        } else if (nota >= 80) {
            // A nota é B
            System.out.println("Você tirou B!");
        } else if (nota >= 70) {
            // A nota é C
            System.out.println("Você tirou C!");
        } else {
            // A nota é D ou F
            System.out.println("Você tirou D ou F!");
        }

        /*
        * Exemplo 3: Operadores de comparação
        */

        int num1 = 10;
        int num2 = 2;

        /*
        * Explicação dos Operadores de Comparação
        *
        * A ordem de precedência dos operadores é importante!
        * Operadores de comparação são avaliados antes de operadores lógicos.
        */

        System.out.println("num1 == num2: " + (num1 == num2)); // False
        System.out.println("num1 != num2: " + (num1 != num2)); // True
        System.out.println("num1 > num2: " + (num1 > num2)); // True
        System.out.println("num1 >= num2: " + (num1 >= num2)); // True
        System.out.println("num1 < num2: " + (num1 < num2)); // False
        System.out.println("num1 <= num2: " + (num1 <= num2)); // False

        /*
        * Explicação Detalhada dos Comentários:
        *
        * Exemplo 1:
        *
        * A variável idade é comparada com 18 usando o operador >=.
        * Se a comparação for verdadeira, o bloco if será executado.
        * Se a comparação for falsa, o bloco else será executado.
        *
        * Exemplo 2:
        *
        * A variável nota é comparada com 90 usando o operador >=.
        * Se a comparação for verdadeira, o bloco if será executado e a mensagem "Você tirou A!" será exibida.
        * Se a comparação for falsa, a próxima comparação será realizada com 80 usando o operador >=.
        * Esse processo se repete até que uma das comparações seja verdadeira ou todas sejam falsas.
        * Se todas as comparações forem falsas, o bloco else será executado.
        *
        * Exemplo 3:
        *
        * Os operadores de comparação são utilizados para comparar os valores das variáveis num1 e num2.
        * O resultado da comparação é um valor booleano (true ou false).
        * Os operadores de comparação são avaliados antes dos operadores lógicos.
        * Observações:
        *
        * Este código é apenas um exemplo, você pode modificá-lo para testar outros cenários.
        * É importante testar seus programas com diferentes valores de entrada para garantir que estejam funcionando corretamente.
        */

    }
}
