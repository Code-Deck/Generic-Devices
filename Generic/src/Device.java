interface DeviceInterface<T> {
    public void sendData(Device d);
}

public class Device<T> implements DeviceInterface{
    private String name;
    private static int modelNumber = 0;
    private T data;

    public Device(String name) {
        this.name = name;
        modelNumber++;
    }

    public Device(String name, T data) {
        this.name = name;
        this.data = data;
        modelNumber++;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Set device name to " + name);
    }

    public String getName() {
        return name;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
        System.out.println("Set model number to " + modelNumber);
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T retrieveData() {
        return data;
    }

    public void sendData(Device d) {
        d.setData(data);
        System.out.println("Sent data to " + d.name);
    }

    public void sendData(T data, Device d) {
        d.setData(data);
        System.out.println("Sent data to " + d.name);
    }

    public void printData() {
        System.out.println("Device: " + name);
        System.out.println("Data: " + data);
    }
}
