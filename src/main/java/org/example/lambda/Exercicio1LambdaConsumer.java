package org.example.lambda;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Exercicio1LambdaConsumer {

    public static void executar() {

        /*
        DESAFIO: Crie um Consumer<String> chamado imprimirMensagem que receba uma string e imprima:
        Mensagem recebida: <texto>
        Depois, chame o método accept passando "Java"
         */

        /*
        Em apenas 1 linha foi criado um pequeno método para receber um parâmetro String e devolver
        uma mensagem customizada. Sem ele, seria obrigatório criar um método inteiro em uma classe.
         */
        Consumer<String> imprimirMensagem =
                texto -> System.out.println("Mensagem recebida: " + texto);

        imprimirMensagem.accept("Java");
    }
}
