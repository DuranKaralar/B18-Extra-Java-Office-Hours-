package day2_StringsAndLoops;

public class BestBuy {

    String location;
    int numberOfEmployees;
    String phoneNumber;
    static int numberOfComputers;

    public void close() {
        System.out.println("This best buy is closed");
    }

    public static void closeALL() {
        System.out.println("All are closing");
    }

}
