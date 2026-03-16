import java.util.*;

public class PalindromeCheckerApp {

    // UC9: Two-Sum Transaction Detection
    public static void twoSumTransactions(){

        int[] transactions = {500, 300, 200};
        int target = 500;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < transactions.length; i++){

            int complement = target - transactions[i];

            if(map.containsKey(complement)){
                System.out.println("Pair found: " + transactions[i] + " + " + complement);
                return;
            }

            map.put(transactions[i], i);
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args){

        System.out.println("UC9");
        twoSumTransactions();

    }
}