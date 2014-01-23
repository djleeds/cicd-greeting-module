package com.hitthebits.greetingmodule;

import java.util.ArrayList;
import java.util.List;

public class GreetingGenerator
{
    private final List<String> greetings;

    public GreetingGenerator() {
        greetings = new ArrayList<String>();
        greetings.add("Hello, World!");
        greetings.add("Howdy");
        greetings.add("Welcome");
        greetings.add("Greetings");
        greetings.add("Yo, Homeslice!");
    }

    public String generate() {
        int index = getRandomIndex();
        return greetings.get(index);
    }

    private int getRandomIndex() {
        double random = Math.random();
        int max = greetings.size();
        return (int)(random * max);
    }

    public static void main(String[] args) {
        GreetingGenerator g = new GreetingGenerator();
        System.out.println(g.generate());
    }
}
