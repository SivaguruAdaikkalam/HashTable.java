import java.util.*;

public class PalindromeCheckerApp {

    // UC5: Real-Time Analytics Dashboard
    public static void realTimeAnalyticsDashboard(){

        HashMap<String,Integer> pageViews = new HashMap<>();
        HashMap<String,Set<String>> uniqueVisitors = new HashMap<>();
        HashMap<String,Integer> trafficSources = new HashMap<>();

        String page = "/article/breaking-news";
        String user = "user_123";
        String source = "google";

        pageViews.put(page, pageViews.getOrDefault(page,0)+1);

        uniqueVisitors.putIfAbsent(page,new HashSet<>());
        uniqueVisitors.get(page).add(user);

        trafficSources.put(source, trafficSources.getOrDefault(source,0)+1);

        System.out.println("Page Views: " + pageViews);
        System.out.println("Unique Visitors: " + uniqueVisitors.get(page).size());
        System.out.println("Traffic Sources: " + trafficSources);
    }

    public static void main(String[] args){

        System.out.println("UC5");
        realTimeAnalyticsDashboard();

    }
}