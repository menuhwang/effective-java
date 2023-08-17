package ch2.item5;

public class Monitor {
    private final Display display;
    private final Speaker speaker;

    public Monitor(Display display, Speaker speaker) {
        this.display = display;
        this.speaker = speaker;
    }

    public void output(DPInput DPInput) {
        display.draw(DPInput);
        speaker.sound(DPInput);
    }
}
