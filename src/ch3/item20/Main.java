package ch3.item20;

class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("청축 키보드");
        Mouse mouse = new Mouse("지슈라");

        Desktop desktop = new Desktop();
        desktop.connect(keyboard);
        desktop.connect(mouse);
        desktop.disconnect(keyboard);
        desktop.disconnect(mouse);

        Laptop laptop = new Laptop();
        laptop.connect(keyboard);
        laptop.connect(mouse);
        laptop.disconnect(keyboard);
        laptop.disconnect(mouse);
    }
}
