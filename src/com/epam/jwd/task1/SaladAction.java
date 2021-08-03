package com.epam.jwd.task1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *Class make salad
 *Show Recipe
 * Count calorie
 *
 * @autor Aleksey Turkov
 * @version 1.0 (30/07/2021)
 */
public class SaladAction extends Salad {

    public void recipe() {
        list.add(new Tuber("Potato",77));
        list.add(new Root("Beetroot",44));
        list.add(new Root("Carrot",32));
        list.add(new Pumpkin("Cucumber",14));
        list.add(new Onion("Onion", 39));
        list.add(new Tomato("Pepper",27));
    }

    //Print recipe in menu
    public void showRecipe() {
        for (Vegetable vegetable : list) {
            System.out.println(vegetable);
        }
    }

    //Add weight to product and count calories
    public void newSalad() {
        int countKcal = 0;
        Scanner sc = new Scanner(System.in);
        for (Vegetable vegetable : list) {
            System.out.print("Enter the number of grams of " + vegetable.getName() + " : ");
            vegetable.setWeight(sc.nextInt());
        }
        for (Vegetable vegetable : list) {
            countKcal += countKcal(vegetable.getWeight(), vegetable.getKcal());
        }
        Print.printOfKcal(countKcal);
    }

    //get cal in 100 gram product
    public int countKcal(int weight, int kcal){
        return weight * kcal / 100;
    }

    //Sort product by name and by kcal
    public void sortIngredient(){
        System.out.println("1. Sort by name");
        System.out.println("2. Sort by kcal");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose) {
            case 1 -> list.sort(Comparator.comparing(Vegetable::getName));
            case 2 -> list.sort(Comparator.comparing(Vegetable::getKcal));
        }
        for (Object o: list) {
            System.out.println(o);
        }
    }

    //Enter min and max calorie
    public void setCalories() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MINIMAL calories: ");
        int minCal = scanner.nextInt();
        System.out.print("Enter MAXIMUM calories: ");
        int maxCal = scanner.nextInt();
        getCalories(minCal,maxCal);
    }

    //Prints all foods in a given calorie range
    public void getCalories(int minCal, int maxCal) {
        List<Vegetable> result = new ArrayList<>();

        for(Vegetable vegetable : list) {
            int current = vegetable.getKcal();
            if(current >= minCal && current <= maxCal) {
                result.add(vegetable);
            }
        }
        System.out.printf("Found - %d vegetables%n", result.size());
        for (Vegetable vegetable : result) {
            System.out.printf("%s - %d", vegetable.getName(), vegetable.getKcal());
        }
    }
}
