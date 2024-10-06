public class LaptopFactory implements DeviceFactory{

    @Override
    public Device createDevice(DeviceDimensions dimensions) {
        Laptop laptop = new Laptop(dimensions.getProcessor(), dimensions.getScreenSize());
        return laptop;
    }
}
