public class Smartphone implements Device{

    private int phoneNo;
    private String screenSize;

    public Smartphone(int phoneNo, String screenSize) {
        this.phoneNo = phoneNo;
        this.screenSize= screenSize;
    }

    @Override
    public void powerOn() {
        System.out.println("Smartphone is powering On");
    }

    @Override
    public void powerOff() {
        System.out.println("Smartphone is powering off");
    }

    public void makeCall()
    {
        System.out.println("Phone is making a call");
    }
    public int getPhoneNo() {
        return phoneNo;
    }

    public String getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Smartphone {" +
                "phoneNo=" + phoneNo +
                ", screenSize='" + screenSize + '\'' +
                '}';
    }
}
