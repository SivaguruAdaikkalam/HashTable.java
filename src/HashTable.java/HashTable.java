import java.util.*;

public class PalindromeCheckerApp {

    // UC3: DNS Cache System
    public static void dnsCacheSystem(){

        HashMap<String,String> dnsCache = new HashMap<>();

        dnsCache.put("google.com","172.217.14.206");
        dnsCache.put("facebook.com","157.240.20.35");
        dnsCache.put("youtube.com","142.250.183.14");

        String domain="google.com";

        if(dnsCache.containsKey(domain)){
            System.out.println("Cache HIT → IP Address: " + dnsCache.get(domain));
        }
        else{
            System.out.println("Cache MISS → Query upstream DNS");
        }
    }

    public static void main(String[] args){

        System.out.println("UC3");
        dnsCacheSystem();

    }
}