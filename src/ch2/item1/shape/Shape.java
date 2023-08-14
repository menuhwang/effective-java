package ch2.item1.shape;

public interface Shape {
    String info();

    static Shape getInstance(String type) {
        if ("circle".equals(type))
            return new Circle();
        else if ("rectangle".equals(type))
            return new Rectangle();
        throw new RuntimeException("shape not found");
    }
}
