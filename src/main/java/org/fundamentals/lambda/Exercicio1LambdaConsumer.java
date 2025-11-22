package org.fundamentals.lambda;

import java.util.function.Consumer;

public class Exercicio1LambdaConsumer {

    public static void executar() {
        descreverDesafio();
        resolverDesafio();
    }

    private static void descreverDesafio() {
        System.out.println("Descrição do desafio ------------------------------");

        String desafio = """
                DESAFIO: Crie um Consumer<String> chamado imprimirMensagem que receba uma string e imprima:
                
                Mensagem recebida: <texto>
                
                Depois, chame o método accept passando "Java"
                """;

        System.out.println(desafio);
    }

    private static void resolverDesafio() {
        System.out.println("Resolução do desafio ------------------------------");

        /*
        Em apenas 1 linha foi criado um pequeno método para receber um parâmetro String e devolver
        uma mensagem customizada. Sem ele, seria obrigatório criar um método inteiro em uma classe.
         */
        Consumer<String> imprimirMensagem =
                texto -> System.out.println("Mensagem recebida: " + texto);

        imprimirMensagem.accept("Java");
    }
}
