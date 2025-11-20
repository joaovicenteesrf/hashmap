package org.example.lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Exercicio2LambdaPredicate {

    public static void executar() {

        /*
        DESAFIO: Crie um Predicate<Integer> chamado ehPositivo que retorne true caso o número
        seja maior que zero.

        Em seguida, teste com os valores 5 e -2.
         */

        Predicate<Integer> ehPositivo =
                numero -> numero > 0;

        System.out.println("Número 5 é positivo? " + ehPositivo.test(5));
        System.out.println("Número -2 é positivo? " + ehPositivo.test(-2));
    }
}
