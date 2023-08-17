package ch2.item5;

public class UHDDisplay implements Display {
    @Override
    public void draw(DPInput DPInput) {
        System.out.println("**<UHD Display>** " + DPInput.getView());
    }
}
