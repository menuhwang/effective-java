package ch2.item2.subway;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Order {
    private final int size;
    private final Bread bread;
    private final Set<Vegetable> vegetables;
    private final Cheese cheese;
    private final Set<Source> sources;
    private final boolean bake;

    public static class Builder {
        private final int size; // 필수 15, 30
        private final Bread bread; // 필수 flat, hearty, wheat
        private final Set<Vegetable> vegetables = new HashSet<>(); // 선택
        private Cheese cheese = null; // 선택
        private final Set<Source> sources = new HashSet<>(); // 선택
        private boolean bake = true; // 선택

        public Builder(int size, Bread bread) {
            if (Objects.isNull(bread))
                throw new IllegalArgumentException("bread must be not null");
            this.size = size;
            this.bread = bread;
        }

        public Builder addVegetable(Vegetable vegetable) {
            if (Objects.isNull(vegetable))
                throw new IllegalArgumentException("vegetable must be not null");
            this.vegetables.add(vegetable);
            return this;
        }

        public Builder cheese(Cheese cheese) {
            if (Objects.isNull(cheese))
                throw new IllegalArgumentException("cheese must be not null");
            this.cheese = cheese;
            return this;
        }

        public Builder addSource(Source source) {
            if (Objects.isNull(source))
                throw new IllegalArgumentException("source must be not null");
            this.sources.add(source);
            return this;
        }

        public Builder bake(boolean bake) {
            this.bake = bake;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    private Order(Builder builder) {
        if (builder.size != 15 && builder.size != 30)
            throw new IllegalArgumentException("size must be 15 or 30");
        this.size = builder.size;
        this.bread = builder.bread;
        this.vegetables = builder.vegetables;
        this.cheese = builder.cheese;
        if (builder.sources.size() > 3)
            throw new RuntimeException("sources are maximum three");
        this.sources = builder.sources;
        this.bake = builder.bake;
    }

    public static Builder builder(int size, Bread bread) {
        return new Builder(size, bread);
    }

    public int getSize() {
        return size;
    }

    public Bread getBread() {
        return bread;
    }

    public Set<Vegetable> getVegetables() {
        return vegetables;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Set<Source> getSources() {
        return sources;
    }

    public boolean isBake() {
        return bake;
    }

    @Override
    public String toString() {
        return "Order{" +
                "size=" + size +
                ", bread=" + bread +
                ", vegetables=" + vegetables +
                ", cheese=" + cheese +
                ", sources=" + sources +
                ", bake=" + bake +
                '}';
    }
}
