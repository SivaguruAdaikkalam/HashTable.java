import java.util.*;

public class PalindromeCheckerApp {

    // UC4: Plagiarism Detection System
    public static void plagiarismDetectionSystem(){

        HashMap<String, Set<String>> ngrams = new HashMap<>();

        String doc1 = "java is a programming language";
        String doc2 = "java is a powerful programming language";

        String[] words = doc1.split(" ");

        for(int i = 0; i < words.length - 1; i++){

            String gram = words[i] + " " + words[i+1];

            ngrams.putIfAbsent(gram, new HashSet<>());
            ngrams.get(gram).add("doc1");
        }

        System.out.println("Stored n-grams:");
        System.out.println(ngrams);
    }

    public static void main(String[] args){

        System.out.println("UC4");
        plagiarismDetectionSystem();

    }
}