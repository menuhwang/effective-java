package ch2.item1.policy;

public class DefaultPolicy implements Policy {
    @Override
    public boolean verify() {
        return true;
    }
}
