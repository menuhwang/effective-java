package ch2.item6.autoboxing;

public class AutoBoxing {
    private static long sum() {
//        Long sum = 0L;
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
