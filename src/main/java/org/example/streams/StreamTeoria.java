package org.example.streams;

public class StreamTeoria {

    public static void executar() {
     String teoria = """
             Stream é uma sequência de elementos de dados que suporta operações funcionais para
             processá-los em um pipeline de funções, como filtrar, transformar e agregar.
             
             Por que utilizar?
                Imagine que você tem uma lista de números e quer realizar as seguintes alterações:
                - Filtrar apenas os pares
                - Multiplicar todos os fatores por 2
                - Somar tudo
             
                Do jeito tradicional, seria necessário fazer cada coisa de uma vez utilizando
                if, for, variáveis acumuladoras etc.
             
                Com Stream, o processo fica mais natual e encadeado.
             
                Ou seja, stream é como se fosse uma esteira de processamento, na qual você consegue:
                - Declarar elementos de entrada
                - Aplicar filtros
                - Realizar transformações
                - Retornar dados já prontos
             
             Operações
                Stream podem ser divididas em operações intermediárias ou terminais.
             
                Operações intermediárias nunca geram um resultado final, apenas montam o "meio da esteira".
                Exemplos:
                    - filter() -> Filtra elementos com base em alguma condição
                    - map() -> Transforma cada elemento da lista
                    - distinct() -> Remove duplicados
                    - sorted() -> Ordena os elementos
                    - limit() -> Pega os N primeiros elementos
             
                Operações terminais executam a stream e produzem algum resultado.
                Exemplos:
                    - forEach() -> Executa algo em cada elemento
                    - collect() -> .collect(Collectors.toList()) junta tudo em uma lista mutável
                    - toList() -> Junta tudo em uma lista imutável
                    - count() -> Conta quantos elementos passaram pela esteira
                    - findFirst() -> Pega o primeiro elemento se existir
                    - reduce() -> Combina tudo em um só valor (soma, média, concatenação etc.)
             
             
                Características da Stream:
             
                - Stream não modifica a lista original
                    Não alteram os dados de origem, apenas criam um fluxo de processamento temporário entre eles
             
                - A stream é consumível e só pode ser usada uma vez
                    Ao executar alguma operação terminal, a Stream se fecha e não pode ser reutilizada
             
                - As operações são 'lazy' e encadeadas
                    O Java não executa as operações intermediárias imediatamente. Ele espera até que uma
                    operação terminal seja chamada.
             
                - A ordem faz diferença
                    Streams respeitam a ordem dos elementos originais, a menos que sejam usadas operações que as alterem
                    (sorted, unordered, parallelStream etc.)
             
                - O resultado pode ser qualquer coisa
                    Uma stream não precisa devolver uma lista. Pode devolver um valor único, um Optional, ou até nada.
             """;

        System.out.println(teoria);

    }
}
