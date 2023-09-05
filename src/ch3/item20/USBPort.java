package ch3.item20;

interface USBPort {

    /**
     * USB 장치를 연결한다.
     * @implSpec
     * 이 메서드는 USB.getName을 호출한다.
     */
    default void connect(USB device) {
        System.out.println(device.getName() + " 연결");
    }

    /**
     * USB 장치를 연결 해제한다.
     * @implSpec 이 메서드는 USB.getName을 호출한다.
     */
    default void disconnect(USB device) {
        System.out.println(device.getName() + " 연결 해제");
    }
}
