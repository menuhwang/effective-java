package ch3.item17;

class Time {
    private final int hour;
    private final int minute;

    private Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public static Time valueOf(int hour, int minute) {
        return new Time(hour, minute);
    }

    public Time plusHour(int hour) {
        return new Time(this.hour + hour, this.minute);
    }

    public Time plusMinute(int minute) {
        return new Time(this.hour, this.minute + minute);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Time)) return false;
        Time time = (Time) o;
        return hour == time.hour && minute == time.minute;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(hour);
        result = result * 31 + Integer.hashCode(minute);
        return result;
    }

    @Override
    public String toString() {
        return String.format("[Time] hour: %d, minute: %d", hour, minute);
    }
}
