package ch2.item1.person;

public class Main {
    public static void main(String[] args) {
        Teacher math1 = Teacher.subjectOf("math");
        System.out.println(math1.info()); // Teacher {subject:math}

        Teacher math2 = Teacher.subjectOf("math");
        System.out.println(math1 == math2); // true

        Teacher math3 = new Teacher("math");
        System.out.println(math1 == math3); // false

        math3 = Person.getTeacher("math");
        System.out.println(math1 == math3); // true

        Student sonny = Student.nameOf("sonny");
        System.out.println(sonny.info()); // Student {name:sonny}

        Student kane = Person.getStudent("kane");
        System.out.println(kane.info()); // Student {name:kane}
    }
}
