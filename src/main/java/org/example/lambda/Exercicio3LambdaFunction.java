package org.example.lambda;

import java.util.function.Function;

public class Exercicio3LambdaFunction {

    public static void executar() {
        descreverDesafio();
        resolverDesafio();
    }

    private static void descreverDesafio() {
        System.out.println("Descrição do desafio ------------------------------");

        String desafio = """
                DESAFIO: Crie uma Function<String, Integer> chamada tamanhoTexto que retorne o tamanho da
                string recebida.
                
                Teste com a palavra "banana", que tem 6 letras.
                """;

        System.out.println(desafio);
    }

    private static void resolverDesafio() {
        System.out.println("Resolução do desafio ------------------------------");

        Function<String, Integer> tamanhoTexto =
                s -> s.length();

        System.out.println("Tamanho da palavra 'Banana': " + tamanhoTexto.apply("banana") + " letras.");
    }
}
