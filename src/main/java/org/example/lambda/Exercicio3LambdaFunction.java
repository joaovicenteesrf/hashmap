package org.example.lambda;

import java.util.function.Function;

public class Exercicio3LambdaFunction {

    public static void executar() {

        /*
        DESAFIO: Crie uma Function<String, Integer> chamada tamanhoTexto que retorne o tamanho da
        string recebida.

        Teste com a palavra "banana", que tem 6 letras.
         */

        Function<String, Integer> tamanhoTexto =
                s -> s.length();

        System.out.println("Tamanho da palavra 'Banana': " + tamanhoTexto.apply("banana") + " letras.");
    }
}
