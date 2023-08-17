package ch2.item5;

public class CheapSpeaker implements Speaker {
    @Override
    public void sound(DPInput DPInput) {
        System.out.println("[Cheap Speaker] " + DPInput.getSound());
    }
}
