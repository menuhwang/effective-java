package ch2.item5;

public class MonitorFactory {
    public static Monitor create(String monitorModel, String speakerModel) {
        return new Monitor(
                DisplayFactory.create(monitorModel),
                SpeakerFactory.create(speakerModel)
        );
    }
}
