package org.fundamentals.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Exercicio4LeituraTags {

    public static void executar() {

        String htmlValido = "<html><body><h1>Título</h1><p>Parágrafo com <br> quebra.</p></body></html>";
        String htmlInvalido1 = "<html><body><h1>Título</p></h1></body></html>";
        String htmlInvalido2 = "<html><body><p>Parágrafo";

        testar(htmlValido);
        testar(htmlInvalido1);
        testar(htmlInvalido2);
    }

    public static void testar(String html) {
        boolean valido = validarHtml(html);
        System.out.println("----------------------------------------");
        System.out.println("HTML analisado: " + html);
        if (valido) {
            System.out.println("O HTML está bem-formado!");
        } else {
            System.out.println("O HTML é inválido!");
        }
    }

    public static boolean validarHtml(String html) {
        // Lista de tags auto-fecháveis que devem ser ignoradas
        Set<String> autoFechaveis = new HashSet<>(Arrays.asList(
                "img", "br", "hr", "input", "meta"
        ));

        Stack<String> pilha = new Stack<>();
        int i = 0;

        while (i < html.length()) {
            int inicio = html.indexOf('<', i);
            if (inicio == -1) break;

            int fim = html.indexOf('>', inicio);
            if (fim == -1) break;

            String tag = html.substring(inicio + 1, fim).trim();
            i = fim + 1;

            // Ignora comentários <!-- -->
            if (tag.startsWith("!--")) continue;

            // Ignora tags vazias
            if (tag.isEmpty()) continue;

            // Ignora tags auto-fecháveis
            if (autoFechaveis.contains(tag.replace("/", ""))) continue;

            if (!tag.startsWith("/")) {
                // Tag de abertura
                pilha.push(tag);
            } else {
                // Tag de fechamento
                String tagFechamento = tag.substring(1);
                if (pilha.isEmpty() || !pilha.peek().equals(tagFechamento)) {
                    return false;
                }
                pilha.pop();
            }
        }

        // Se ainda sobrou algo na pilha, há tag sem fechamento
        return pilha.isEmpty();
    }
}
