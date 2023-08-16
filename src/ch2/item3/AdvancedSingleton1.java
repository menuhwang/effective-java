package ch2.item3;

public class AdvancedSingleton1 {
    private static final AdvancedSingleton1 INSTANCE = new AdvancedSingleton1();

    private AdvancedSingleton1() {
        if (INSTANCE != null)
            throw new RuntimeException("instance exists");
    }

    public void doSomething() {
        System.out.println("[AdvancedSingleton1] do something");
    }
}
