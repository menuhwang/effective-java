package ch3.item20;

final class Desktop implements USBPort {
    @Override
    public void connect(USB device) {
        System.out.printf("[%8s] ", this.getClass().getSimpleName());
        USBPort.super.connect(device);
    }

    @Override
    public void disconnect(USB device) {
        System.out.printf("[%8s] ", this.getClass().getSimpleName());
        USBPort.super.disconnect(device);
    }
}
