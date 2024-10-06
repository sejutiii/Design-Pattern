public class PhoneFactory implements DeviceFactory{
    @Override
    public Device createDevice(DeviceDimensions dimensions) {
        Device phone = new Smartphone(dimensions.getPhoneNo(), dimensions.getScreenSize());
        return phone;
    }
}
