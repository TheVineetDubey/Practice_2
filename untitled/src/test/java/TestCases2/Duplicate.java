package TestCases2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {

    public static void main(String[] args) {
        // Given sentence
        String sentence = "alex brian charles alex charles david eric david";

        // Find and print duplicate words
        Set<String> duplicates = findDuplicateWords(sentence);

        // Print results
        System.out.println("Duplicate words: " + duplicates);
    }

    public static Set<String> findDuplicateWords(String sentence) {
        // Normalize the text to lowercase
        sentence = sentence.toLowerCase();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Create a map to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Find duplicate words
        Set<String> duplicates = new HashSet<>();
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }
}
