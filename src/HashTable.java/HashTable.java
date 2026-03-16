import java.util.*;

public class HashTable {

    // UC1: Username Availability Checker
    static HashMap<String,Integer> users = new HashMap<>();
    static HashMap<String,Integer> attempts = new HashMap<>();

    public static void usernameAvailabilityChecker() {

        users.put("john_doe",1);
        users.put("admin",2);

        String username="john_doe";

        attempts.put(username, attempts.getOrDefault(username,0)+1);

        if(users.containsKey(username)){
            System.out.println("Username already taken");

            System.out.println("Suggestions:");
            System.out.println(username+"1");
            System.out.println(username+"2");
            System.out.println(username.replace("_","."));
        }
        else{
            System.out.println("Username available");
        }

        System.out.println("Attempt count: "+attempts.get(username));
    }

    public static void main(String[] args) {

        usernameAvailabilityChecker();

    }
}