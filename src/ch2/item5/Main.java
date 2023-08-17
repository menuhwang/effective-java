package ch2.item5;

public class Main {
    public static void main(String[] args) {
        FHDDisplay fhdDisplay = new FHDDisplay();
        UHDDisplay uhdDisplay = new UHDDisplay();
        CheapSpeaker cheapSpeaker = new CheapSpeaker();
        NoneSpeaker noneSpeaker = new NoneSpeaker();

        Monitor model1 = new Monitor(fhdDisplay, cheapSpeaker);
        DPInput testDPInput = new DPInput("display test", "sound test");
        System.out.println("model1 testing...");
        model1.output(testDPInput);

        Monitor gamingMonitor = new Monitor(uhdDisplay, noneSpeaker);
        System.out.println("\ngaming monitor testing...");
        gamingMonitor.output(testDPInput);

        Monitor gamingMonitorWithSpeaker = new Monitor(uhdDisplay, cheapSpeaker);
        System.out.println("\ngaming monitor with speaker testing...");
        gamingMonitorWithSpeaker.output(testDPInput);

        Monitor model2 = MonitorFactory.create("fhd", "none");
        System.out.println("\nmodel2 testing...");
        model2.output(testDPInput);
    }
}
