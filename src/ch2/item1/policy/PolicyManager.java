package ch2.item1.policy;

public class PolicyManager {
    private static Policy policy = new DefaultPolicy();
    public static Service getService() {
        return new Service(policy);
    }

    public static void registerPolicy(Policy p) {
        policy = p;
    }
}
