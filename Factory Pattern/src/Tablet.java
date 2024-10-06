public class Tablet implements Device{

    private String screensize;

    public Tablet(String screensize) {
        this.screensize = screensize;
    }
    @Override
    public void powerOn() {
        System.out.println("Tablet is powering On");
    }
    @Override
    public void powerOff() {
        System.out.println("Tablet is powering Off");
    }

    public String getScreensize() {
        return screensize;
    }

    @Override
    public String toString() {
        return "Tablet {" +
                "screensize='" + screensize + '\'' +
                '}';
    }
}
