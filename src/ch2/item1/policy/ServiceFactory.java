package ch2.item1.policy;

public class ServiceFactory {
    public static Service getInstance() {
        return new Service(PolicyProvider.getInstance());
    }
}
