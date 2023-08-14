package ch2.item1.policy;

public class CustomPolicy implements Policy {
    private boolean flag;

    public CustomPolicy(boolean flag) {
        this.flag = flag;
    }

    public void toggle() {
        this.flag = !flag;
    }

    @Override
    public boolean verify() {
        return flag;
    }
}
