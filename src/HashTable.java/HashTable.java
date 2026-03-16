import java.util.*;

public class PalindromeCheckerApp {

    // UC2 method
    public static void flashSaleInventoryManager(){

        HashMap<String,Integer> stock = new HashMap<>();
        Queue<Integer> waitingList = new LinkedList<>();

        stock.put("IPHONE15_256GB",100);

        String product="IPHONE15_256GB";
        int userId=12345;

        if(stock.get(product) > 0){

            stock.put(product, stock.get(product)-1);

            System.out.println("Purchase successful for user "+userId);
            System.out.println("Remaining stock: "+stock.get(product));
        }
        else{

            waitingList.add(userId);

            System.out.println("Stock finished");
            System.out.println("User added to waiting list");
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        flashSaleInventoryManager();

    }
}