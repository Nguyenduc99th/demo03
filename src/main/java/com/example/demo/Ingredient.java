package com.example.demo;

import java.lang.reflect.Type;

@Data
public class Ingredient {
    private  final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }


}
