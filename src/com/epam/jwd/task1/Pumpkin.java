package com.epam.jwd.task1;

/**
 *Class exstends Vegetable
 *
 * @autor Aleksey Turkov
 * @version 1.0 (30/07/2021)
 */
public class Pumpkin extends Vegetable {

    public Pumpkin(String name, int kcal) {
        super(name, kcal);
        setCategory("Pumpkin");   //  Set category to fields
    }
}
