public class TabletFactory implements DeviceFactory{

    @Override
    public Device createDevice(DeviceDimensions dimensions) {
        Device tablet= new Tablet(dimensions.getScreenSize());
        return tablet;
    }
}
