package ch2.item5;

public class SpeakerFactory {
    public static Speaker create(String model) {
        switch (model) {
            case "cheap":
                return new CheapSpeaker();
            case "none":
                return new NoneSpeaker();
            default:
                throw new AssertionError();
        }
    }
}
