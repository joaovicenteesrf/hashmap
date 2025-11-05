package org.example.hashmap;

import java.util.*;

public class Exercicio3RankingAlunos {

    public static void executar() {
        Map<String, Double> notas = new HashMap<>();
        notas.put("Ana", 9.5);
        notas.put("Bruno", 7.8);
        notas.put("Carla", 8.9);
        notas.put("Daniel", 6.5);

        // Encontrar aluno com maior nota
        String melhorAluno = "";
        double maiorNota = 0.0;

        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            if (entry.getValue() > maiorNota) {
                melhorAluno = entry.getKey();
                maiorNota = entry.getValue();
            }
        }

        System.out.println("Melhor aluno: " + melhorAluno + " (" + maiorNota + ")");

        // Exibir ranking ordenado
        System.out.println("\nRanking (ordem decrescente de notas):");
        notas.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}

