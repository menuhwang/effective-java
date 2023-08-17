package ch2.item5;

public class DisplayFactory {
    public static Display create(String model) {
        switch (model) {
            case "fhd":
                return new FHDDisplay();
            case "uhd":
                return new UHDDisplay();
            default:
                throw new AssertionError();
        }
    }
}
