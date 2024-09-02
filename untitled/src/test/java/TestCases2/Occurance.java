package TestCases2;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

    public static void main(String[] args) {

        String statement = "alex brian charles alex charles david eric david";

        Map<Character, Integer> charCounts = countCharacters(statement);

        // Print the results
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacters(String statement) {
        // Normalize the text to lowercase
        statement = statement.toLowerCase();

        // Create a map to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : statement.toCharArray()) {
            // Update the count for each character
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}
