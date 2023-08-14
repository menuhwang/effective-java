package ch2.item1.person;

public class Student implements Person {
    private final String name;

    private Student(String name) {
        this.name = name;
    }

    public static Student nameOf(String name) {
        return new Student(name);
    }

    @Override
    public String info() {
        return String.format("Student {name:%s}", name);
    }
}
