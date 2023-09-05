package ch3.item20;

import java.util.PriorityQueue;

class Main2 {
    public static void main(String[] args) {
        Person person1 = new Person("A", 180, 100);
        Person person2 = new Person("B", 170, 70);
        Person person3 = new Person("C", 160, 50);

        PriorityQueue<Person> group = new PriorityQueue<>();
        group.add(person1);
        group.add(person2);
        group.add(person3);

        while (!group.isEmpty())
            group.poll().greet();
    }
}
