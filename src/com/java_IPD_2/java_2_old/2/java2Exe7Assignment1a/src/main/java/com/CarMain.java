package _java_exe.java2Exe7Assignment1a.src.main.java.com;

public class CarMain {

    public static void main(String[] args) {
        Toyota myToyota = new Toyota("ADD000");
        myToyota.addLicense("ADD001");
        myToyota.addLicense("ADD002");
        myToyota.removeLicense("REMOVE1");
        System.out.println("This is my " + myToyota.getMake());
        System.out.println(myToyota.getLicenseArray()[0].getLicense());
        System.out.println(myToyota.getLicenseArray()[1].getLicense());
        System.out.println(myToyota.getLicenseArray()[2].getLicense());
                }
}
