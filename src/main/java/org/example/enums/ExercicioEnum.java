package org.example.enums;

public enum ExercicioEnum {
    HASHMAP,
    STREAM;


    public static ExercicioEnum fromChoice(int escolha) {
        return switch (escolha) {
            case 1 -> HASHMAP;
            case 2 -> STREAM;
            default -> throw new IllegalArgumentException("Opção inválida");
        };
    }
}
