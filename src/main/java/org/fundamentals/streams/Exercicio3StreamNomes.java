package org.fundamentals.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Exercicio3StreamNomes {

    public static void executar() {
        descreverDesafio();
        resolverDesafio();
    }

    private static void descreverDesafio() {
        System.out.println("Descrição do desafio ------------------------------");

        String desafio = """
                DESAFIO: Receba uma lista de nomes e produza uma nova lista mutável contendo
                apenas nomes com mais de 4 letras, todos com letras maiúsculas.
                
                Após terminar a stream, adicionar um novo nome à lista mutável.
                """;

        System.out.println(desafio);
    }

    private static void resolverDesafio() {
        System.out.println("Resolução do desafio ------------------------------");

        List<String> nomes = List.of("Ana", "Carla", "Pedro", "João", "Matheus", "Fernando", "Lia", "Bia");

        // Criação da nova lista filtrada
        List<String> resultado = nomes.stream()
                // Iterando sobre cada nome da lista e filtrando apenas os com mais de 4 letras
                .filter(nome -> nome.length() > 4)
                // Executando sobre cada nome da nova lista a operação String.toUpperCase()
                .map(String::toUpperCase)
                // Retornando uma lista MUTÁVEL com Collectors.toList()
                .collect(Collectors.toList());

        System.out.println("Lista original: " + nomes);
        System.out.println("Lista filtrada mutável: " + resultado);

        // Adicionando mais um termo à lista mutável
        resultado.add("JORGE");

        System.out.println("Lista filtrada mutável com mais um resultado: " + resultado);
    }
}
