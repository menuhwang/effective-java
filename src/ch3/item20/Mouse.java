package ch3.item20;

final class Mouse implements USB{
    private final String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
