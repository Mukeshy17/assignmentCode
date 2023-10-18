import java.util.HashSet;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jump over the lazy dog";

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove spaces and convert the input to lowercase
        input = input.replaceAll(" ", "").toLowerCase();

        // Create a HashSet to store the unique characters
        HashSet<Character> characters = new HashSet<>();

        // Iterate through each character in the input
        for (char c : input.toCharArray()) {
            // Check if the character is a letter from 'a' to 'z'
            if (c >= 'a' && c <= 'z') {
                characters.add(c);
            }
        }

        // Check if the HashSet size is 26 (all letters from 'a' to 'z')
        return characters.size() == 26;
    }
}
