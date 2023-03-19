package com.ahmetgltkn;

import java.util.Arrays;

public class Menu {
    private Meal[] meals = new Meal[10]; //{0,1,2,3,4,5....}
    private int mealCount = 0;

    public void addMeal(Meal meal) {
        meals[mealCount] = meal;
        mealCount++;
    }

    public void removeMeal(Meal meal) {
        int index = -1;
        for (int i = 0; i < mealCount; i++) {
            if (meals[i].equals(meal)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < mealCount; i++) {
                meals[i] = meals[i + 1];
            }
            meals[mealCount - 1] = null;
            mealCount--;
        } else
            System.out.println("yemek bulunamadı");
    }

    public void printAllMeals() {
        System.out.println("MENÜ");
        for (int i = 0; i < mealCount; i++) {
            Meal meal = meals[i];
            System.out.println("Yemek Adı: " + meal.getName());
            System.out.println("Ücreti: " + meal.getPrice());
            System.out.println("Malzemeler: " + Arrays.toString(meal.getIngredients()));
            System.out.println("Kalori: " + meal.getCalories());
            System.out.println("Vegan: " + (meal.isVegan() ? "EVET" : "HAYIR"));
            System.out.println("Gluten içerir mi: " + (meal.isGlutenFree() ? "EVET" : "HAYIR"));
            System.out.println("----------------------------");
        }
        System.out.println("Toplam Fiyat :" + totalPrice());
        System.out.println("Toplam Fiyat :" + totalCalories());
    }

    private double totalPrice() {
        double toplam = 0;
        for (int i = 0 ; i<mealCount ; i++){
            toplam += meals[i].getPrice();
        }
        return toplam;
    }
    private double totalCalories() {
        double toplam = 0;
        for (int i = 0 ; i<mealCount ; i++){
            toplam += meals[i].getCalories();
        }
        return toplam;
    }
}
