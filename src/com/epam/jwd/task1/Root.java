package com.epam.jwd.task1;

/**
 *Class exstends Vegetable
 *
 * @autor Aleksey Turkov
 * @version 1.0 (30/07/2021)
 */
public class Root extends Vegetable{

    public Root(String name, int kcal) {
        super(name, kcal);
        setCategory("Root");            //  Set category to fields
    }
}
