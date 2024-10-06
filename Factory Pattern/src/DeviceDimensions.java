public class DeviceDimensions {
    private int phoneNo;
    private String processor;
    private String screenSize;

    public DeviceDimensions(String processor, String screenSize) {
        this.processor = processor;
        this.screenSize = screenSize;
    }

    public DeviceDimensions(String screenSize, int phoneNo) {
        this.phoneNo = phoneNo;
        this.screenSize = screenSize;
    }
    public DeviceDimensions(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getProcessor() {
        return processor;
    }

    public String getScreenSize() {
        return screenSize;
    }
}
