package com.epam.jwd.task1;
import java.util.ArrayList;
import java.util.List;

/**
 * Class save list vegetables
 *
 * @autor Aleksey Turkov
 * @version 1.0 (30/07/2021)
 */
public class Salad {
    List<Vegetable> list = new ArrayList<>();

    @Override
    public String toString() {
        String NAME = "Vinaigrette";
        return "Salad " + NAME;
    }
}
