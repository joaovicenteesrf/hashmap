package org.fundamentals.lambda;

public class LambdaTeoria {

    public static void executar() {
     String teoria = """
             Expressões Lambda foram introduzidas no Java 8 e mudaram a forma como desenvolvedores escrevem código.
             
             Antes do Java 8, era necessário criar classes inteiras só para representar pequenas ações, e com as
             expressões Lambda é possível representar essas ações em linha, de forma simples e elegante.
             
             - O que é uma expressão Lambda?
                De forma simples, uma expressão Lambda é uma função Java compactada.
                Elas são usadas quando você quer passar um comportamento como argumento.
             
             
             Características:
             
             - Lambdas não existem sozinhas
                Esse é um detalhe que muitos iniciantes não sabem: Lambdas só fazem sentido quando atribuídas
                a uma interface funcional.
             
                Uma interface funcional é aquela que tem um único método abstrato, como:
                    - Runnable -> método run()
                    - Consumer<T> -> método accept(T)
                    - Predicate<T> -> método test(T)
                    - Function<T,R> -> método apply(T)
             
             
             - Estrutura do Lambda
                A expressão Lambda é composta de duas partes:
             
                    (parâmetros) -> {corpo da função}
                    (x,y) -> {x + y}
            
             
             - São funções anônimas
                Não é necessário dar nome, como em declarações de variável
             
             - São funções curtas e enxutas
                Se a função Lambda tem mais de 5 linhas, ela deveria ser um método
             
             - Podem ter nenhum, um ou vários parâmetros
             
             - Podem ter retorno implícito ou explícito
             
             - Podem usar variáveis que vêm "de fora"
             
             - São usadas de forma intensa com Streams
             
             
             Conclusão:
             
             Pra que elas servem?
             - Para passar comportamentos como argumentos
             - Para processar coleções de dados
             - Para simplificiar classes internas anônimas, evitando código repetitivo
             - Para deixar o código mais expressivo, direto ao ponto
             
             Quando não utilizar?
             - Quando a função for longa demais
             - Quando a lógica for complexa, é melhor ter um método nomeado
             - Quando compromete a clareza do código
             - Quando você precisa de mais de um método, aí a função deixa de ser simples
             """;

        System.out.println(teoria);

    }
}
