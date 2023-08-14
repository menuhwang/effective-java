package ch2.item1.policy;

public class Main2 {
    public static void main(String[] args) {
        CustomPolicy customPolicy = new CustomPolicy(false);
        PolicyProvider.registerPolicy(customPolicy);
        Service service = ServiceFactory.getInstance();

        service.doSomething();

        customPolicy.toggle();
        service.doSomething();
    }
}
