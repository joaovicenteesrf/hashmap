package org.example;

import lombok.*;
import org.example.enums.ExercicioEnum;
import org.example.hashmap.*;
import org.example.streams.Exercicio0ExemploStream;

import java.util.Map;
import java.util.Scanner;


public class EscolhaExercicios {
    private static final Scanner scanner = new Scanner(System.in);

    public static void executar() {
        System.out.println("Qual tipo de exercício? \n");
        System.out.println("1 - " + ExercicioEnum.HASHMAP + "\n");
        System.out.println("2 - " + ExercicioEnum.STREAM + "\n");
        int escolhaTipo = scanner.nextInt();

        ExercicioEnum tipoExercicio = ExercicioEnum.fromChoice(escolhaTipo);

        if (tipoExercicio.equals(ExercicioEnum.HASHMAP)) {
            executarHashmap();
        }

        if (tipoExercicio.equals(ExercicioEnum.STREAM)) {
            executarStream();
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
        System.out.println("0 - Exercício zero - Exemplo inicial");

        Map<Integer, Runnable> exerciciosHashmap = Map.of(
                0, Exercicio0ExemploStream::executar
        );

        int escolhaExercicio = scanner.nextInt();
        exerciciosHashmap.getOrDefault(escolhaExercicio, () ->
                System.out.println("Opção inválida!")
        ).run();
    }

    private static void executarHashmap() {
        System.out.println("Qual exercício? \n");
        System.out.println("0 - Exercício zero - Exemplo inicial");
        System.out.println("1 - Exercício um - Contagem de palavras");
        System.out.println("2 - Exercício dois - Agenda Telefônica");
        System.out.println("3 - Exercício três - Ranking alunos");
        System.out.println("4 - Exercício quatro - Leitura de tags");


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
}
