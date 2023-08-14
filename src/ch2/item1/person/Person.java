package ch2.item1.person;

public interface Person {
    String info();

    static Teacher getTeacher(String subject) {
        return Teacher.subjectOf(subject);
    }

    static Student getStudent(String name) {
        return Student.nameOf(name);
    }
}
