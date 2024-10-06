public class Main {
    public static void main(String[] args) {
       DeviceDimensions Ldim= new DeviceDimensions("Core i5", "16 inch");
       DeviceDimensions Tdim= new DeviceDimensions("12 inch");
       DeviceDimensions Pdim= new DeviceDimensions("8 inch", 1299390);
       DeviceFactory laptopFactory= new LaptopFactory();
       Device myLaptop= laptopFactory.createDevice(Ldim);

       DeviceFactory tabletFactory= new TabletFactory();
       Device myTablet= tabletFactory.createDevice(Tdim);

       DeviceFactory phoneFactory= new PhoneFactory();
       Device myPhone= phoneFactory.createDevice(Pdim);

        System.out.println(myLaptop);
        System.out.println(myTablet);
        System.out.println(myPhone);
    }
}