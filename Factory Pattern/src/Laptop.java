public class Laptop implements Device{
    private String processor;
    private String screenSize;

    public Laptop(String processor, String screenSize) {
        this.processor = processor;
        this.screenSize = screenSize;
    }

    @Override
    public void powerOn() {
        System.out.println("Laptop is powering On");
    }

    @Override
    public void powerOff() {
        System.out.println("Laptop is powering Off");
    }

    public String getProcessor() {
        return processor;
    }
    public String getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "processor='" + processor + '\'' +
                ", screenSize='" + screenSize + '\'' +
                '}';
    }
}
