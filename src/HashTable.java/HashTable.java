import java.util.*;

public class PalindromeCheckerApp {

    // UC7: Autocomplete System
    public static void autocompleteSystem(){

        HashMap<String,Integer> searchQueries = new HashMap<>();

        searchQueries.put("java tutorial",1234567);
        searchQueries.put("javascript",987654);
        searchQueries.put("java download",456789);

        String prefix = "jav";

        System.out.println("Search suggestions:");

        for(String query : searchQueries.keySet()){

            if(query.startsWith(prefix)){
                System.out.println(query + " (" + searchQueries.get(query) + " searches)");
            }
        }
    }

    public static void main(String[] args){

        System.out.println("UC7");
        autocompleteSystem();

    }
}