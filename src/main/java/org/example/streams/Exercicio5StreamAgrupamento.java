package org.example.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio5StreamAgrupamento {

    public static void executar() {

        /*
        DESAFIO: Receba uma lista de nomes e

        1 - Agrupe-os por letra inicial e gere um Map<Character, List<String>> onde:
        - A chave é a primeira letra do nome
        - O valor é a lista de nomes que começam com essa letra, ordenados alfabeticamente
         */

        List<String> nomes = List.of("Ana", "Alice", "Bruno", "Bia", "Carlos", "Caio", "Davi", "Douglas");

        Map<Character, List<String>> agrupamentoDeNomes = nomes.stream()
                .sorted()
                .collect(Collectors.groupingBy(nome -> nome.charAt(0)));

        System.out.println("Map criado");
        System.out.println("Chaves do Map: " + agrupamentoDeNomes.keySet());
        System.out.println("Valores do Map: " + agrupamentoDeNomes.values() + "\n");

        agrupamentoDeNomes.forEach((letra, lista) ->
                System.out.println(letra + " -> " + lista)
        );
    }
}
