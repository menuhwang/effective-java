package ch2.item5;

public class FHDDisplay implements Display {
    @Override
    public void draw(DPInput DPInput) {
        System.out.println("[FHD Display] " + DPInput.getView());
    }
}
