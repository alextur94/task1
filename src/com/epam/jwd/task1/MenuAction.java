package com.epam.jwd.task1;
import java.util.Scanner;

/**
 *Class where run all methods
 *
 * @autor Aleksey Turkov
 * @version 1.0 (30/07/2021)
 */

public class MenuAction extends Menu {
    //Add item menu in list
    public void itemMenu() {
        menuAction.add("=============================");
        menuAction.add("Choose an action");
        menuAction.add("1.Show Recipe");
        menuAction.add("2.Make a salad and count kcal");
        menuAction.add("3.Sort ingredients");
        menuAction.add("4.Found vegetable");
        menuAction.add("0.Exit");
    }

    //This method print menu
    public void showMenu() {
        for (String s : menuAction) {
            System.out.println(s);
        }
    }

    //This method show main menu and create main logic menu
    public void mainMenu() {
        SaladAction action = new SaladAction();
        Scanner scanner = new Scanner(System.in);
        int choose = getDefaultChoose();
        itemMenu();
        action.recipe();
        while (choose == -1) {
            showMenu();
            System.out.print("You're choose: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 0 -> choose = 1;
                case 1 -> {
                    action.showRecipe();
                    choose = -1;
                }
                case 2 -> {
                    action.newSalad();
                    choose = -1;
                }
                case 3 -> {
                    action.sortIngredient();
                    choose = -1;
                }
                case 4 -> {
                    action.setCalories();
                    choose = -1;
                }
                default -> mainMenu();
            }
        }
    }
}
