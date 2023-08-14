package ch2.item1.person;

import java.util.HashMap;
import java.util.Map;

public class Teacher implements Person {
    private static final Map<String, Teacher> instances = new HashMap<>();
    private final String subject;

    static {
        instances.put("math", new Teacher("math"));
    }
    public Teacher(String subject) {
        this.subject = subject;
    }

    public static Teacher subjectOf(String subject) {
        if (instances.containsKey(subject))
            return instances.get(subject);

        return new Teacher(subject);
    }

    @Override
    public String info() {
        return String.format("Teacher {subject:%s}", subject);
    }
}
