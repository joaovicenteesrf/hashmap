package org.example.streams;

import java.util.Comparator;
import java.util.List;

public class Exercicio4StreamPegarMaioresNotas {

    public static void executar() {

        /*
        DESAFIO: Receba uma lista de notas e faça o seguinte:

        1- Remova duplicados
        2- Ordene em ordem decrescente
        3- retorne apenas as 3 maiores em uma lista IMUTÁVEL
         */

        List<Integer> notas = List.of(7, 10, 10, 6, 8, 9, 8);

        List<Integer> top3 = notas.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println("Lista de notas completa: " + notas);
        System.out.println("Top 3 notas: " + top3);

    }
}
