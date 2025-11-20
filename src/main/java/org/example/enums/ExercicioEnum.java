package org.example.enums;

public enum ExercicioEnum {
    HASHMAP,
    STREAM,
    LAMBDA;


    public static ExercicioEnum fromChoice(int escolha) {
        return switch (escolha) {
            case 1 -> HASHMAP;
            case 2 -> STREAM;
            case 3 -> LAMBDA;
            default -> throw new IllegalArgumentException("Opção inválida");
        };
    }
}
