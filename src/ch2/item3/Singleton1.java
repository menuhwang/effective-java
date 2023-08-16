package ch2.item3;

public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {}

    public void doSomething() {
        System.out.println("[Singleton1] do something");
    }
}
