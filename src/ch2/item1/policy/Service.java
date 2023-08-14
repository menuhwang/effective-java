package ch2.item1.policy;

public class Service {
    private final Policy policy;

    public Service(Policy policy) {
        this.policy = policy;
    }

    public void doSomething() {
        if (policy.verify())
            System.out.println("do something");
        else
            System.out.println("pass");
    }
}
