package com.ahmetgltkn;

public class Main {

    public static void main(String[] args) {
        Meal meal = new Meal("Mercimek Çorbası",12.5,new String[]{"mercime,yağ,su,tuz"},100,true,true);
        Meal meal2 = new Meal("Yaprak Sarma",5,new String[]{"prinç,salça"},200,true,false);
        Meal meal3 = new Meal("Pizza",50,new String[]{"un,süt,sucuk,peynir"},500,false,false);
        Meal meal4 = new Meal("Köfte",12.5,new String[]{"kıyma,baharat"},1000,false,true);

        Menu menu = new Menu();
        menu.addMeal(meal);
        menu.addMeal(meal3);
        menu.addMeal(meal4);
        menu.addMeal(meal3);
        menu.addMeal(meal2);


        menu.removeMeal(meal2);

        menu.printAllMeals();
    }
}
