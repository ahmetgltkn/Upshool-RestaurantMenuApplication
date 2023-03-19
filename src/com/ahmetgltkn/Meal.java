package com.ahmetgltkn;

public class Meal {

    private String name;
    private double price;
    private String[] ingredients;
    private int calories;
    private boolean vegan;
    private boolean glutenFree;

    public Meal(String name, double price,String[] ingredients, int calories, boolean vegan,boolean glutenFree){
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.calories = calories;
        this.vegan = vegan;
        this.glutenFree = glutenFree;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
}
