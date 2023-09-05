package ch3.item20;

final class Person implements Comparable<Person>, Speech {
    private final String name;
    private final int height;
    private final int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    private float bmi() {
        return (float) weight / height / height;
    }

    @Override
    public int compareTo(Person o) {
        return Float.compare(bmi(), o.bmi());
    }

    public void greet() {
        speak(String.format("[%s] 안녕하세요.", name));
    }
}
