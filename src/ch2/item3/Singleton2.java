package ch2.item3;

public class Singleton2 {
    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return INSTANCE;
//        return new Singleton2();
    }

    public void doSomething() {
        System.out.println("[Singleton2] do something");
    }
}
