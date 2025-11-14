package org.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercicio0ExemploStream {

    // Classe com exemplos dos principais métodos do Stream


    public static void executar() {
        // Declarando uma nova lista de números inteiros
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);



        // Exemplo de como filtrar uma lista
        System.out.println("Exemplo filter() ----------------");

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Lista original: " + numeros);
        System.out.println("Lista filtrada: " + pares + "\n");



        // Exemplo do map: Manipula os itens da lista e cria um novo fluxo
        System.out.println("Exemplo map() -------------------");

        List<String> nomes = List.of("João", "Ana", "Letícia", "Pedro");

        List<String> nomesMaiusculos = nomes.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Lista de nomes original: " + nomes);
        System.out.println("Lista de nomes modificado pelo map: " + nomesMaiusculos + "\n");



        // Exemplo de ordenação dos elementos da lista
        System.out.println("Exemplo sorted() --------------------");

        List<Integer> numerosEmbaralhados = List.of(1, 4, 2, 3, 9, 8, 5, 2);
        System.out.println("Lista dos números original: " + numerosEmbaralhados);

        List<Integer> numerosReorganizados = numerosEmbaralhados.stream()
                .sorted()
                .toList();

        System.out.println("Lista reorganizada: " + numerosReorganizados + "\n");



        // Exemplo de remoção dos duplicados
        System.out.println("Exemplo distinct() ---------------------------");

        List<Integer> numerosRepetidos = List.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6);
        System.out.println("Lista original com elementos duplicados: " + numerosRepetidos);

        List<Integer> numerosSemRepeticao = numerosRepetidos.stream()
                .distinct()
                .toList();

        System.out.println("Lista sem os elementos duplicados: " + numerosSemRepeticao + "\n");



        // Exemplo de controle de fluxo e como ignorar termos da lista
        System.out.println("Exemplo limit() e skip() -----------------");

        List<Integer> listaGrandeNumeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> primeiros5Numeros = listaGrandeNumeros.stream()
                .limit(5)
                .toList();

        List<Integer> listaIgnora3Termos = listaGrandeNumeros.stream()
                .skip(3)
                .toList();

        System.out.println("Lista com todos os números: " + listaGrandeNumeros);
        System.out.println("Lista com os primeiros 5 números: " + primeiros5Numeros);
        System.out.println("Lista com os 3 primeiros termos ignorados: " + listaIgnora3Termos + "\n");



        // Exemplo execução de ação em todos os termos da lista
        System.out.println("Exemplo forEach() ---------------------");
        System.out.println("Lista de nomes: " + nomes);

        nomes.stream()
            .forEach(nome -> {
                System.out.println("Nome " + nome + " passou pelo forEach!!");
                if (nome.equals("Letícia")) {
                    System.out.println("\n LETÍCIA APARECEU NA LISTA! \n");
                }
            });

        System.out.println("\n");



        // Exemplo operação terminal Collection: utilizado no lugar de toList() para listas mutáveis
        System.out.println("Exemplo collect() -------------");

        List<String> listaNomesMaioresQue3Letras = nomes.stream()
                .filter(n -> n.length() > 3)
                .collect(Collectors.toList());


        System.out.println("Lista original: " + nomes);
        listaNomesMaioresQue3Letras.add("Joaquim");
        System.out.println("Lista modificada após o término do stream: " + listaNomesMaioresQue3Letras + "\n");



        // Exemplo contagem de termos restantes
        System.out.println("Exemplo count() -----------------------");

        Long numerosPares = listaGrandeNumeros.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Lista completa: " + listaGrandeNumeros);
        System.out.println("Contagem do número de pares na lista: " + numerosPares + " números. \n");




        // Exemplo encontrar primeiro elemento da lista
        System.out.println("Exemplo findFirst() --------------------------");

        Optional<String> primeiroNome = nomes.stream()
                .findFirst();

        System.out.println("Lista de nomes completa: " + nomes);
        System.out.println("O primeiro nome da lista é: " + primeiroNome + "\n");



        // Exemplo condições sobre o fluxo
        System.out.println("Exemplo anyMatch(), allMatch() e noneMatch() -------------------");
        System.out.println("Lista de números completa: " + listaGrandeNumeros);

        boolean temMaiorQue10 = listaGrandeNumeros.stream().anyMatch(n -> n > 10);
        boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);
        boolean nenhumMaiorQue100 = numeros.stream().noneMatch(n -> n > 100);

        System.out.println("Tem números maior que 10: " + temMaiorQue10);
        System.out.println("Todos são positivos: " + todosPositivos);
        System.out.println("Nenhum maior que 100: " + nenhumMaiorQue100 + "\n");



        // Exemplo reduce: soma, produto ou concatena os resultados
        System.out.println("Exemplo reduce() ---------------------------");

        int soma = listaGrandeNumeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("Lista original: " + listaGrandeNumeros);
        System.out.println("Soma: " + soma + "\n");
    }
}
