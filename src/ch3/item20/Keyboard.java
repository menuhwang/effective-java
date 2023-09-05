package ch3.item20;

final class Keyboard implements USB{
    private final String name;

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
