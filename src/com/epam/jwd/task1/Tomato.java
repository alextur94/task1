package com.epam.jwd.task1;

/**
 *Class exstends Vegetable
 *
 * @autor Aleksey Turkov
 * @version 1.0 (30/07/2021)
 */
public class Tomato extends Vegetable {

    public Tomato(String name, int kcal) {
        super(name, kcal);
        setCategory("Tomato");          //  Set category to fields
    }
}
