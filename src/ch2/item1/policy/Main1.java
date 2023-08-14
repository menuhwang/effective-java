package ch2.item1.policy;

public class Main1 {
    public static void main(String[] args) {
        Service service = ServiceFactory.getInstance();

        service.doSomething();
    }
}
