import java.util.*;

public class PalindromeCheckerApp {

    // UC10: Multi-Level Cache System
    public static void multiLevelCacheSystem(){

        LinkedHashMap<String,String> L1Cache = new LinkedHashMap<>();
        HashMap<String,String> L2Cache = new HashMap<>();

        L2Cache.put("video_123","SSD_VIDEO_DATA");
        L2Cache.put("video_456","SSD_VIDEO_DATA");

        String videoId = "video_123";

        if(L1Cache.containsKey(videoId)){
            System.out.println("L1 Cache HIT (Memory)");
        }
        else if(L2Cache.containsKey(videoId)){

            System.out.println("L2 Cache HIT (SSD)");

            L1Cache.put(videoId, L2Cache.get(videoId));

            System.out.println("Video promoted to L1 Cache");
        }
        else{

            System.out.println("L3 Database HIT");
        }
    }

    public static void main(String[] args){

        System.out.println("UC10");
        multiLevelCacheSystem();

    }
}