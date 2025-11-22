package org.example;

import lombok.*;
import org.example.enums.ExercicioEnum;
import org.example.hashmap.*;
import org.example.lambda.Exercicio1LambdaConsumer;
import org.example.lambda.Exercicio2LambdaPredicate;
import org.example.lambda.Exercicio3LambdaFunction;
import org.example.streams.*;

import java.util.Map;
import java.util.Scanner;


public class EscolhaExercicios {
    private static final Scanner scanner = new Scanner(System.in);

    public static void executar() {
        System.out.println("Qual tipo de exercício? \n");
        System.out.println("1 - " + ExercicioEnum.HASHMAP + "\n");
        System.out.println("2 - " + ExercicioEnum.STREAM + "\n");
        System.out.println("3 - " + ExercicioEnum.LAMBDA + "\n");
        int escolhaTipo = scanner.nextInt();

        ExercicioEnum tipoExercicio = ExercicioEnum.fromChoice(escolhaTipo);

        if (tipoExercicio.equals(ExercicioEnum.HASHMAP)) {
            executarHashmap();
        }

        if (tipoExercicio.equals(ExercicioEnum.STREAM)) {
            executarStream();
        }

        if (tipoExercicio.equals(ExercicioEnum.LAMBDA)) {
            executarLambda();
        }

        System.out.println("\nDeseja executar outro exercício? (s/n)");
        String resposta = scanner.next();
        if (resposta.equalsIgnoreCase("s")) {
            executar();
        } else {
            System.out.println("Encerrando...");
        }
    }

    @SneakyThrows
    private static void executarStream() {
        System.out.println("Qual exercício? \n");
        System.out.println("0 - Teoria");
        System.out.println("1 - Exemplo inicial");
        System.out.println("2 - Ordenação de números - FÁCIL");
        System.out.println("3 - Ordenação de nomes - FÁCIL");
        System.out.println("4 - Soma dos positivos - FÁCIL");
        System.out.println("5 - Top 3 notas - FÁCIL");
        System.out.println("6 - Agrupamento de nomes - MÉDIO");

        Map<Integer, Runnable> exerciciosHashmap = Map.of(
                0, StreamTeoria::executar,
                1, Exercicio1ExemploStream::executar,
                2, Exercicio2StreamOrdenacao::executar,
                3, Exercicio3StreamNomes::executar,
                4, Exercicio4StreamSomaPositivos::executar,
                5, Exercicio5StreamPegarMaioresNotas::executar,
                6, Exercicio6StreamAgrupamento::executar
        );

        int escolhaExercicio = scanner.nextInt();
        exerciciosHashmap.getOrDefault(escolhaExercicio, () ->
                System.out.println("Opção inválida!")
        ).run();
    }

    private static void executarHashmap() {
        System.out.println("Qual exercício? \n");
        System.out.println("0 - Exemplo inicial");
        System.out.println("1 - Contagem de palavras");
        System.out.println("2 - Agenda Telefônica");
        System.out.println("3 - Ranking alunos");
        System.out.println("4 - Leitura de tags");


        Map<Integer, Runnable> exerciciosHashmap = Map.of(
                0, Exercicio0ExemploHashmap::executar,
                1, Exercicio1ContagemPalavras::executar,
                2, Exercicio2AgendaTelefonica::executar,
                3, Exercicio3RankingAlunos::executar,
                4, Exercicio4LeituraTags::executar
        );

        int escolhaExercicio = scanner.nextInt();
        exerciciosHashmap.getOrDefault(escolhaExercicio, () ->
                System.out.println("Opção inválida!")
        ).run();
    }

    private static void executarLambda() {
        System.out.println("Qual exercício? \n");
        System.out.println("1 - Consumer");
        System.out.println("2 - Predicate");
        System.out.println("3 - Function");


        Map<Integer, Runnable> exerciciosHashmap = Map.of(
                1, Exercicio1LambdaConsumer::executar,
                2, Exercicio2LambdaPredicate::executar,
                3, Exercicio3LambdaFunction::executar
        );

        int escolhaExercicio = scanner.nextInt();
        exerciciosHashmap.getOrDefault(escolhaExercicio, () ->
                System.out.println("Opção inválida!")
        ).run();
    }
}
