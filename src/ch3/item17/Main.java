package ch3.item17;

import java.util.HashSet;

class Main {
    private static final int HOUR_PER_DAY = 24;
    private static final int MINUTE_PER_HOUR = 60;
    public static void main(String[] args) {
        Time time1 = Time.valueOf(8, 0);
        System.out.println(time1); //[Time] hour: 8, minute: 0

        Time time2 = time1.plusHour(2);
        System.out.println(time2); //[Time] hour: 10, minute: 0

        Time time3 = time2.plusMinute(30);
        System.out.println(time3); //[Time] hour: 10, minute: 30

        Time time4 = time1.plusHour(1)
                .plusMinute(40); //[Time] hour: 9, minute: 40
        System.out.println(time4);

        HashSet<Time> times = new HashSet<>();
        for (int hh = 0; hh < HOUR_PER_DAY; hh++) {
            for (int mm = 0; mm < MINUTE_PER_HOUR; mm++) {
                times.add(Time.valueOf(hh, mm));
            }
        }

        System.out.printf("times.size == %d * %d ? %s\n", HOUR_PER_DAY, MINUTE_PER_HOUR, times.size() == HOUR_PER_DAY * MINUTE_PER_HOUR);
    }
}
