package ch3.item20;

interface Speech {
    default void speak(String voice) {
        System.out.println(voice);
    }
}
