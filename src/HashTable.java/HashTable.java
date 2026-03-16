import java.util.*;

public class PalindromeCheckerApp {

    // UC8: Parking Lot Management with Open Addressing
    public static void parkingLotManagement(){

        String[] parking = new String[10];   // parking lot with 10 spots

        String vehicle = "ABC-1234";

        int hash = Math.abs(vehicle.hashCode() % 10);

        int probes = 0;

        while(parking[hash] != null){
            hash = (hash + 1) % 10;   // linear probing
            probes++;
        }

        parking[hash] = vehicle;

        System.out.println("Vehicle " + vehicle + " parked at spot #" + hash);
        System.out.println("Probes required: " + probes);
    }

    public static void main(String[] args){

        System.out.println("UC8");
        parkingLotManagement();

    }
}