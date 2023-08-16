package ch2.item1.policy;

public class Main2 {
    public static void main(String[] args) {
        CustomPolicy customPolicy = new CustomPolicy(false);
        PolicyManager.registerPolicy(customPolicy);
        Service service = PolicyManager.getService();

        service.doSomething();

        customPolicy.toggle();
        service.doSomething();
    }
}
