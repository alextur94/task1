package com.epam.jwd.task1;

import java.util.Objects;

/**
 *main class with fields
 *
 * @autor Aleksey Turkov
 * @version 1.0 (30/07/2021)
 */
public abstract class Vegetable {
    private String name;
    private String category;
    private int kcal;
    private int weight;

    /**
     * Constructor for fields
     * @param name
     * @param kcal
     */
    public Vegetable(String name, int kcal) {
        this.name = name;
        this.kcal = kcal;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") -" + kcal + " kcal";
    }

    /**
     * GETtery and SETtery for fields
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
}
