package ch2.item1.policy;

public class PolicyProvider {
    private static Policy policy = new DefaultPolicy();
    public static Policy getInstance() {
        return policy;
    }

    public static void registerPolicy(Policy p) {
        policy = p;
    }
}
