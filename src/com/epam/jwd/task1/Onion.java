package com.epam.jwd.task1;

/**
 *Class exstends Vegetable
 *
 * @autor Aleksey Turkov
 * @version 1.0 (30/07/2021)
 */
public class Onion extends Vegetable{

    public Onion(String name, int kcal) {
        super(name, kcal);
        setCategory("Onion");           //  Set category to fields
    }
}
