import java.util.*;

public class PalindromeCheckerApp {

    // UC6: Distributed Rate Limiter
    public static void rateLimiter(){

        HashMap<String,Integer> requestCount = new HashMap<>();

        String clientId = "abc123";

        requestCount.put(clientId, requestCount.getOrDefault(clientId,0)+1);

        if(requestCount.get(clientId) <= 5){
            System.out.println("Request allowed. Remaining requests: " + (5 - requestCount.get(clientId)));
        }
        else{
            System.out.println("Rate limit exceeded for client: " + clientId);
        }
    }

    public static void main(String[] args){

        System.out.println("UC6");
        rateLimiter();

    }
}