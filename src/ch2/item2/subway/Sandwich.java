package ch2.item2.subway;

import java.util.Set;

public class Sandwich {
    private final int size;
    private final Bread bread;
    private final Set<Vegetable> vegetables;
    private final Cheese cheese;
    private final Set<Source> sources;
    private final boolean bake;

    public Sandwich(Order order) {
        this.size = order.getSize();
        this.bread = order.getBread();
        this.vegetables = order.getVegetables();
        this.cheese = order.getCheese();
        this.sources = order.getSources();
        this.bake = order.isBake();
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size +
                ", bread=" + bread +
                ", vegetables=" + vegetables +
                ", cheese=" + cheese +
                ", sources=" + sources +
                ", bake=" + bake +
                '}';
    }
}
