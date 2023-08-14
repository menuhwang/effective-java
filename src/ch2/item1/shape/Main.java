package ch2.item1.shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = Shape.getInstance("circle");
        System.out.println(circle.info()); // Circle

        Shape rectangle = Shape.getInstance("rectangle");
        System.out.println(rectangle.info()); // Rectangle
    }
}
