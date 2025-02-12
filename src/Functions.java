public class Functions {
    //    O seguinte código ilustra a sintaxe elementar para definir funções.
//    Ao experimentar executar por exemplo next(4) irá ser devolvido o mesmo número (4).
//    Altere o código para que seja devolvido o número seguinte ao fornecido para o parâmetro n (5 para o exemplo dado).
    int next(int n) {
        return n + 1;
    }

    //    Complete a função para que seja devolvido o número anterior ao passado como argumento.
    int previous(int n) {
        return n - 1;
    }

    //    Escreva uma função para calcular o dobro de um número real (parâmetro n).
    double doubleOf(double n) {
        return n * 2.0;
    }

    //    Escreva uma função com nome square para calcular o quadrado de um número inteiro.
    int square(int n) {
        return n * n;
    }

    // 5.    Complete a função para calcular a diferença entre dois números.
    int difference(int a, int b) {
        return a - b;
    }

    //    6. Escreva uma função para calcular a média de dois números reais (double).
    double averageDouble(double a, double b) {
        return (a + b) / 2.0;

    }

    //    7. Escreva uma função para calcular a média de dois números inteiros.
    double averageInt(int a, int b) {
        return (a + b) / 2.0;
    }

    //    8. Pretende-se uma função para obter arredondamentos (excesso/defeito).
//    A seguinte implementação faz uma truncagem de um número inteiro, experimente executar round(4.9).
//    Altere o código tendo em conta o objetivo.
    int round(double n) {
        return (int) (n + .5);
    }

    //    9. Pretende-se que a seguinte função indique se um número é negativo (verdadeiro/falso).
//    O código tem um erro de compilação e um erro lógico. O objetivo é corrigir os erros.
    boolean isNegative(int x) {
        return x < 0;
    }

    //   10. Escreva uma função para determinar se um número é um dígito (i.e., está no intervalo [0-9]).
    boolean eDigito(int n) {
        return n >= 0 && n <= 9;
    }

    // 11.   Escreva uma função isEven para determinar se um número é par.
    boolean isEven(int n) {
        return n % 2 == 0;
    }

    //  12.  Escreva uma função isOdd para determinar se um número é ímpar.
    boolean isOdd(int n) {
        return n % 2 != 0;
        // return !isEven(n)
    }

    // 13.   Escreva uma função abs para obter o valor absoluto de um número real, utilizando uma expressão condicional.
//            (cond ? trueValue : falseValue)
    double abs(double n) {
        return (n>=0?n:n*-1);
}
//    Escreva uma função min para obter o valor mínimo entre dois números reais, utilizando uma expressão condicional.
//    Escreva uma função para calcular a soma dos primeiros n números naturais, segundo a seguinte fórmula.
//
//
//    Escreva uma função para determinar se um carácter (char) corresponde a uma vogal minúscula.
//    boolean isVowel(char c) {
//
//    }
//    Escreva uma função para determinar se três números inteiros estão por ordem estritamente crescente (não podem haver repetidos).
//    Escreva uma função para determinar se um número inteiro está incluído num dado intervalo (fechado, de inteiros). O primeiro parâmetro corresponderá ao número a verificar (n), e outros dois ao intervalo [min, max].
//    boolean isIncluded(int n, int min, int max) {
//
//    }
//    Escreva uma função para determinar se um número inteiro está excluído de um dado intervalo (de inteiros, fechado). O primeiro parâmetro corresponderá ao número a verificar, e outros dois ao intervalo.
//    Complete a função para calcular a operação lógica disjunção exclusiva (XOR) entre dois valores booleanos, sem utilizar o operador ^.
//    a	b	XOR
//true	true	false
//        true	false	true
//        false	true	true
//        false	false	false
//    boolean xor(boolean a, boolean b) {
//
//    }
//    Escreva uma função para determinar se dois números inteiros têm o mesmo sinal (i.e. são ambos positivos ou negativos). Considere que zero não é positivo nem negativo (não tem sinal), e logo, quando há um zero nos valores, a resposta será sempre falsa.
//    Escreva uma função para determinar se entre dois números inteiros apenas um é positivo.
//    Inclua no seguinte módulo as funções min e inOrder escritas anteriormente, utilizando o modificador static à semelhança do exemplo.
//    class Util {
//        static double max(double a, double b) {
//            return a > b ? a : b;
//        }
//
//    }
}
