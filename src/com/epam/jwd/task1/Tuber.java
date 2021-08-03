package com.epam.jwd.task1;

/**
 *Class exstends Vegetable
 *
 * @autor Aleksey Turkov
 * @version 1.0 (30/07/2021)
 */
public class Tuber extends Vegetable {

    public Tuber(String name, int kcal) {
        super(name, kcal);
        setCategory("Tuber");           //  Set category to fields
    }
}
