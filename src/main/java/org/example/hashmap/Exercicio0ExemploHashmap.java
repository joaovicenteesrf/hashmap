package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Exercicio0ExemploHashmap {

    public static void executar() {
        // Declaração do Hashmap
        Map<String, Double> notas = new HashMap<>();


        // Inserindo dados no Hashmap
        notas.put("Clara", 7.0);
        notas.put("Pedro", 10.0);
        notas.put("João", 8.0);
        notas.put("Bia", 5.0);
        notas.put("Bruna", 9.0);
        notas.put("Ana", 7.0);

        // Resgatando um valor e retornando ao usuário
        System.out.println("Demonstração GET -------------------");
        Double notaAna = notas.get("Ana");
        System.out.println("Ana tirou nota " + notaAna + "\n");


        // Validando se o item existe no Hashmap
        System.out.println("Demonstração containsKey -------------");
        if (notas.containsKey("João")) {
            System.out.println("Existe João na lista!\n");
        } else {
            System.out.println("Não existe João na lista!\n");
        }
        if (notas.containsKey("Mariana")) {
            System.out.println("Existe Mariana na lista!\n");
        } else {
            System.out.println("Não existe Mariana na lista!\n");
        }

        // Validando se apenas o valor existe no Hashmap
        System.out.println("Demonstração containsValue ------------");
        boolean alguemGabaritou = notas.containsValue(10.0);

        if (alguemGabaritou) {
            System.out.println("Alguém gabaritou! \n");
        } else {
            System.out.println("Ninguém conseguiu tirar nota máxima... \n");
        }

        /*
        Extra: Como descobrir QUEM gabaritou?
        O Hashmap não foi feito para encontrar buscas por valor nativamente,
        mas é possível encontrá-lo com entrySet.
         */
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            String nome = entry.getKey();
            if (entry.getValue().equals(10.0)) {
                System.out.println(nome + " conseguiu tirar nota máxima!!! \n");
            }
        }


        // Excluindo alguém da lista
        System.out.println("Demonstração remove ------------");
        notas.remove("Ana");
        boolean anaEstaPresente = notas.containsKey("Ana");
        if (!anaEstaPresente) {
            System.out.println("Ana foi removida da lista! \n");
        }


        // Verificando o tamanho da lista
        System.out.println("Demonstração size -------------");
        int tamanhoDaLista = notas.size();
        System.out.println("A lista tem " + tamanhoDaLista + " aluno(s) \n");


        // Verificando se a lista está vazia e como limpar a lista inteira
        System.out.println("Demonstração isEmpty e clear -----------");
        while (!notas.isEmpty()) {
            System.out.println("A lista não está vazia! Ela contém " + notas.size() + " aluno(s)");
            System.out.println("Limpando a lista...");
            notas.clear();
        }
        System.out.println("A lista está vazia! \n");


        // Inserindo os dados novamente na lista que foi limpa
        notas.put("Clara", 7.0);
        notas.put("Pedro", 10.0);
        notas.put("João", 8.0);
        notas.put("Bia", 5.0);
        notas.put("Bruna", 9.0);
        notas.put("Ana", 7.0);


        // Como retornar todos os valores contidos no Hashmap
        System.out.println("Demonstração values -------------");
        System.out.println("Apenas as notas da lista: " + notas.values() + "\n");


        // Entryset: pegar cada item do Hashmap e manipular
        System.out.println("Demonstração entrySet ---------------------");
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            String nome = entry.getKey();
            Double nota = entry.getValue();
            int hashcode = entry.hashCode();

            System.out.println(nome + " tirou nota " + nota + " --> Hashcode: " + hashcode);
        }
        System.out.println("\n");


        // Inserir apenas se o item não existir na lista
        System.out.println("Demonstração putIfAbsent -----------------");
        notas.putIfAbsent("Mariana", 9.5);
        notas.putIfAbsent("Bia", 10.0);

        boolean alunaNovaFoiAdicionada = notas.containsKey("Mariana");
        if (alunaNovaFoiAdicionada) {
            System.out.println("Aluna Mariana entrou na turma!");
        }

        if (notas.get("Bia").equals(10.0)) {
            System.out.println("Nota da bia foi alterada para 10.0! \n");
        } else {
            System.out.println("Nota da bia não foi alterada! Sua nota ainda é " + notas.get("Bia") + "\n");
        }


        // Substituindo os valores para uma chave existente com replace
        System.out.println("Demonstração replace ---------------");
        double notaAnteriorJoao = notas.get("João");
        notas.replace("João", 10.0);
        double notaAtualJoao = notas.get("João");

        if (notaAnteriorJoao != notaAtualJoao) {
            System.out.println("Nota do João mudou! Sua nota saiu de " + notaAnteriorJoao + " para " + notaAtualJoao + "!");
        }

        notas.replace("Antônio", 3.9);
        if (!notas.containsKey("Antônio")) {
            System.out.println("Não foi possível alterar a nota de Antônio, pois ele não está na lista! \n");
        }

    }
}

