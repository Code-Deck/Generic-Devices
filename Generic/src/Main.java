public class Main {
    public static void main(String[] args) {
        Device phone = new Device("Phone");
        phone.setData("20 Games and 35 apps total");
        Device laptop = new Device("Laptop");
        DeviceInterface deviceI = (Device d) -> phone.sendData(d);
        deviceI.sendData(laptop);
        laptop.printData();
    }
}