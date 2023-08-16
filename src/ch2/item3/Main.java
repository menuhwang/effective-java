package ch2.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton1 singleton1 = Singleton1.INSTANCE;
        singleton1.doSomething(); // [Singleton1] do something

        // 리플렉션 예외
        Singleton1 newSingleton1 = null;
        Constructor<?> singleton1Constructor = Singleton1.class.getDeclaredConstructor();
        singleton1Constructor.setAccessible(true);
        newSingleton1 = (Singleton1) singleton1Constructor.newInstance();

        newSingleton1.doSomething(); // [Singleton1] do something

        System.out.println(singleton1); // ch2.item3.Singleton1@21a06946
        System.out.println(newSingleton1); // ch2.item3.Singleton1@77f03bb1
        System.out.println(singleton1 == newSingleton1); // false

        // 리플렉션 예외 처리
        AdvancedSingleton1 advancedSingleton1 = null;
        Constructor<?> advancedSingleton1Constructor = AdvancedSingleton1.class.getDeclaredConstructor();
        advancedSingleton1Constructor.setAccessible(true);
        advancedSingleton1 = (AdvancedSingleton1) advancedSingleton1Constructor.newInstance();

        advancedSingleton1.doSomething();

//        Singleton2 singleton2 = Singleton2.getInstance();
//        singleton2.doSomething();
//
//        Singleton3 singleton3 = Singleton3.INSTANCE;
//        singleton3.doSomething();
    }
}
