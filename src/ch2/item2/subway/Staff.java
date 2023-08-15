package ch2.item2.subway;

public class Staff {
    public static Sandwich processOrder(Order order) {
        System.out.println("[staff] check order");
        System.out.println(order);
        return new Sandwich(order);
    }
}
