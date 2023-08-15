package ch2.item2.subway;

import static ch2.item2.subway.Bread.*;
import static ch2.item2.subway.Cheese.AMERICAN;
import static ch2.item2.subway.Source.*;
import static ch2.item2.subway.Vegetable.*;

public class Subway {
    public static void main(String[] args) {
        Order newOrder = Order.builder(15, HEARTY_ITALIAN)
                .addVegetable(LETTUCE)
                .addVegetable(TOMATOES)
                .addVegetable(CUCUMBERS)
                .addVegetable(PEPPERS)
                .addSource(SMOKE_BBQ)
                .addSource(HORSERADISH)
                .addSource(BLACK_PEPPER)
                .cheese(AMERICAN)
                .bake(false)
                .build();

        Sandwich newSandwich = Staff.processOrder(newOrder);
        System.out.println(newSandwich);

//        Order wrongOrder1 = Order.builder(20, HEARTY_ITALIAN).build();

//        Order wrongOrder2 = Order.builder(15, null).build();

//        Order wrongOrder3 = Order.builder(15, FLAT_BREAD).addVegetable(null).build();

//        Order wrongOrder4 = Order.builder(15, FLAT_BREAD).addSource(null).build();

//        Order wrongOrder5 = Order.builder(15, FLAT_BREAD)
//                .addSource(BLACK_PEPPER)
//                .addSource(HOT_CHILLI)
//                .addSource(HORSERADISH)
//                .addSource(RED_WINE_VINAIGRETTE).build();

//        Order wrongOrder6 = Order.builder(15, HONEY_OAT)
//                .cheese(null)
//                .build();
    }
}
