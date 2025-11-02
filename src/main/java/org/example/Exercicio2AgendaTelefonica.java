package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2AgendaTelefonica {

    // Principais conceitos: CRUD, containsKey, remove, put

    public static void executar() {
        Scanner sc = new Scanner(System.in);
        Map<String, String> agenda = new HashMap<>();

        agenda.put("Ana", "99999-1111");
        agenda.put("Bruno", "98888-2222");
        agenda.put("Carla", "97777-3333");

        while (true) {
            System.out.println("\n=== Agenda Telefônica ===");
            System.out.println("1. Listar contatos");
            System.out.println("2. Adicionar contato");
            System.out.println("3. Buscar contato");
            System.out.println("4. Remover contato");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    for (Map.Entry<String, String> entry : agenda.entrySet()) {
                        System.out.println(entry.getKey() + " → " + entry.getValue());
                    }
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    agenda.put(nome, telefone);
                    System.out.println("Contato adicionado!");
                    break;
                case 3:
                    System.out.print("Nome a buscar: ");
                    String busca = sc.nextLine();
                    if (agenda.containsKey(busca)) {
                        System.out.println("Telefone: " + agenda.get(busca));
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Nome a remover: ");
                    String remover = sc.nextLine();
                    agenda.remove(remover);
                    System.out.println("Removido (se existia).");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
