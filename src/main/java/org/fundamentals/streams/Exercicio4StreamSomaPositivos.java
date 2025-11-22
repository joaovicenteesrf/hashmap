package org.fundamentals.streams;

import java.util.List;

public class Exercicio4StreamSomaPositivos {

    public static void executar() {
        descreverDesafio();
        resolverDesafio();
    }

    private static void descreverDesafio() {
        System.out.println("Descrição do desafio ------------------------------");

        String desafio = """
                DESAFIO: Dada uma lista de números inteiros positivos e negativos, filtre
                apenas os positivos e retorne a soma total deles.
                """;

        System.out.println(desafio);
    }

    private static void resolverDesafio() {
        System.out.println("Resolução do desafio ------------------------------");

        List<Integer> numeros = List.of(-3, 5, 9, 0, 10, -4, 7);

        // Vai retornar apenas um valor inteiro, da soma total
        int somaPositivos = numeros.stream()
                // filtrando números que são maior que zero
                .filter(numero -> numero > 0)
                // reduzindo os números a um único resultado partindo do 0.
                .reduce(0, Integer::sum);

        System.out.println("Lista original: " + numeros);
        System.out.println("Soma dos números positivos: " + somaPositivos);
    }
}
