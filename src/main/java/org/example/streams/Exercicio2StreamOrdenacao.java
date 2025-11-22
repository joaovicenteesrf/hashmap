package org.example.streams;

import java.util.List;

public class Exercicio2StreamOrdenacao {

    public static void executar() {

        String desafio = """
            
                DESAFIO: Receba uma lista de 15 números aleatórios e:
                        1 - Remova as duplicatas
                        2 - Filtre apenas os ímpares
                        3 - Organize-os de forma crescente
                        4 - Retorne o resultado em uma lista IMUTÁVEL
                """;

        System.out.println(desafio);

        // Lista recebida
        List<Integer> numeros = List.of(3, 10, 7, 4, 9, 2, 29, 85, 100, 83, 3, 19, 10, 10, 5);

        // Criação da nova lista que será manipulada com stream
        List<Integer> imparesOrdenados = numeros.stream()
                // Removendo os duplicados
                .distinct()
                // Criação do filtro para ímpares
                .filter(n -> n % 2 != 0)
                // Organização de forma crescente com sorted()
                .sorted()
                // Retorno do resultado com toList() para devolver uma lista imutável
                .toList();


        System.out.println("Lista original: " + numeros + "\n");
        System.out.println("Lista dos números ímpares ordenados sem duplicados: " + imparesOrdenados);

    }
}
