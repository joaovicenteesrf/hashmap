package org.fundamentals.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Exercicio1ContagemPalavras {

    // Principais conceitos: getOrDefault, contagem de frequências, iteração com entrySet

    public static void executar() {
        String frase = "O Java é lindo o Java é odiado o Java é incrível";
        String[] palavras = frase.split(" ");

        Map<String, Integer> contagem = new HashMap<>();

        for (String palavra : palavras) {
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        System.out.println("Frase: " + frase);
        System.out.println("Contagem de palavras:");
        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

