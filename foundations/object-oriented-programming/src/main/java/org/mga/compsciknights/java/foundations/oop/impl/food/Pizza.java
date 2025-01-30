package org.mga.compsciknights.java.foundations.oop.impl.food;

import org.mga.compsciknights.java.foundations.oop.api.Meal;
import org.mga.compsciknights.java.foundations.oop.dictionary.MealState;
import org.mga.compsciknights.java.foundations.oop.dictionary.PizzaTopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza implements Meal {

    private int slices;
    private List<PizzaTopping> toppings;
    private Map<String, Integer> size;

    public Pizza(List<PizzaTopping> toppingList) {
        toppings = new ArrayList<>();
        size = new HashMap<>();

        size.put("LARGE", 10);
        size.put("MEDIUM", 8);
        size.put("SMALL", 6);

        if (toppingList.isEmpty()) {
            this.toppings.add(PizzaTopping.SAUCE);
        } else {
            this.toppings = toppingList;
        }
    }

    @Override
    public MealState getCurrentState() {
        if (size.get("LARGE").toString().equals("LARGE") && slices == size.get("LARGE")) {
            return MealState.WHOLE;
        } else if (size.get("LARGE").equals("LARGE") && (slices > 0 && slices < size.get("LARGE"))) {
            return MealState.PARTIAL;
        } else {
            return MealState.GONE;
        }
    }

    public int getSlices() {
        return slices;
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }

    public List<PizzaTopping> getToppings() {
        return toppings;
    }

    public void setToppings(List<PizzaTopping> toppings) {
        this.toppings = toppings;
    }

    public Map<String, Integer> getSize() {
        return size;
    }

    public void setSize(Map<String, Integer> size) {
        this.size = size;
    }
}
