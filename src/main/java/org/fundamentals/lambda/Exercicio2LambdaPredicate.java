package org.fundamentals.lambda;

import java.util.function.Predicate;

public class Exercicio2LambdaPredicate {

    public static void executar() {
        descreverDesafio();
        resolverDesafio();
    }

    private static void descreverDesafio() {
        System.out.println("Descrição do desafio ------------------------------");

        String desafio = """
                DESAFIO: Crie um Predicate<Integer> chamado ehPositivo que retorne true caso o número
                seja maior que zero.

                Em seguida, teste com os valores 5 e -2.
                """;

        System.out.println(desafio);
    }

    private static void resolverDesafio() {
        System.out.println("Resolução do desafio ------------------------------");

        Predicate<Integer> ehPositivo =
                numero -> numero > 0;

        System.out.println("Número 5 é positivo? " + ehPositivo.test(5));
        System.out.println("Número -2 é positivo? " + ehPositivo.test(-2));
    }
}
