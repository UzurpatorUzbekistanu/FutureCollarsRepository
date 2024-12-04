package org.futurecollars.lesson11task2pizza;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PizzaMenu {
    public static void main(String[] args) {
        List<Pizza> menu = Arrays.asList(
                new Pizza("Margherita", true, Arrays.asList("mozarella", "pomidor"), 250),
                new Pizza("Pepperoni", false, Arrays.asList("mozarella", "salami"), 300),
                new Pizza("Vegetariana", true, Arrays.asList("mozarella", "pieczarki", "cebula", "pomidor", "papryka"), 280),
                new Pizza("Quattro Stagioni", false, Arrays.asList("mozarella", "pieczarki", "salami", "cebula"), 320),
                new Pizza("Diavola", false, Arrays.asList("mozarella", "salami", "papryka"), 310),
                new Pizza("Funghi", true, Arrays.asList("mozarella", "pieczarki"), 260),
                new Pizza("Hawaiian", false, Arrays.asList("mozarella", "szynka", "ananas"), 270),
                new Pizza("Capricciosa", false, Arrays.asList("mozarella", "pieczarki", "szynka"), 290),
                new Pizza("Quattro Formaggi", true, Arrays.asList("mozarella", "gorgonzola", "parmezan", "ricotta"), 350),
                new Pizza("Siciliana", true, Arrays.asList("mozarella", "pomidor", "papryka", "seler"), 275)
        );

        List<String> vegetarianPizzas = menu.stream()
                .filter(Pizza::isVegetarian)
                .map(Pizza::getName)
                .collect(Collectors.toList());
        System.out.println("Wegetariańskie pizze: " + vegetarianPizzas);


        List<String> pizzasWithCelery = menu.stream()
                .filter(p -> p.getIngredients().contains("seler"))
                .map(Pizza::getName)
                .collect(Collectors.toList());
        System.out.println("Pizze z alergenami (seler): " + pizzasWithCelery);


        boolean vegetarianWithTomatoAndPepper = menu.stream()
                .anyMatch(p -> p.isVegetarian() && p.getIngredients().containsAll(Arrays.asList("pomidor", "papryka")));
        System.out.println("Czy istnieje wegetariańska pizza z pomidorem i papryką? " + vegetarianWithTomatoAndPepper);


        boolean allContainMozzarella = menu.stream()
                .allMatch(p -> p.getIngredients().contains("mozarella"));
        System.out.println("Czy wszystkie pizze zawierają mozzarellę? " + allContainMozzarella);


        Optional<Pizza> highestCaloriePizza = menu.stream()
                .max((p1, p2) -> Integer.compare(p1.getCalories(), p2.getCalories()));
        highestCaloriePizza.ifPresent(p -> System.out.println("Pizza o najwyższej kaloryczności: " + p.getName() + " (" + p.getCalories() + " kcal)"));


        Optional<Pizza> lowestCaloriePizza = menu.stream()
                .min((p1, p2) -> Integer.compare(p1.getCalories(), p2.getCalories()));
        lowestCaloriePizza.ifPresent(p -> System.out.println("Pizza o najniższej kaloryczności: " + p.getName() + " (" + p.getCalories() + " kcal)"));
    }
}

