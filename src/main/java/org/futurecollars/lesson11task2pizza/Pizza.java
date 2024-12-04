package org.futurecollars.lesson11task2pizza;

import java.util.List;

public class Pizza {
    private boolean isVegetarian;
    private List<String> ingredients;
    private int calories;
    private String name;

    public Pizza(String name, boolean isVegetarian, List<String> ingredients, int calories) {
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
        this.calories = calories;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{name='" + name + "', isVegetarian=" + isVegetarian + ", ingredients=" + ingredients + ", calories=" + calories + '}';
    }
}

