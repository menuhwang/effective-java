package ch3.item16;

public class Main {
    public static void main(String[] args) {
        BadTime badTime = new BadTime(8, 30);

        System.out.printf("%d시 %d분\n", badTime.hour, badTime.minute);

        Time time1 = new Time(10, 0);
        Time time2 = new Time(10, 0);

        System.out.println("Time1: " + time1);
        System.out.println("hash: " + time1.hashCode());
        System.out.println("Hours: " + time1.getHour());
        System.out.println("Minutes: " + time1.getMinute());
        System.out.println("As minutes: " + time1.asMinutes());

        System.out.println("Time2: " + time2);
        System.out.println("hash: " + time2.hashCode());
        System.out.println("Hours: " + time2.getHour());
        System.out.println("Minutes: " + time2.getMinute());
        System.out.println("As minutes: " + time2.asMinutes());

        System.out.println("Time1 == Time2 ? " + time1.equals(time2));
    }
}
