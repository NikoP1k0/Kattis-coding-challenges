package Easy.G;

import java.util.*;

public class guesswho {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int N = myScanner.nextInt();  // Number of characters
        int M = myScanner.nextInt();  // Number of attributes
        int Q = myScanner.nextInt();  // Number of questions
        myScanner.nextLine();

        // Store character attributes
        List<String> characters = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            characters.add(myScanner.nextLine());
        }

        // Read and store questions
        Map<Integer, Character> questions = new HashMap<>();
        for (int i = 0; i < Q; i++) {
            int attrIndex = myScanner.nextInt() - 1;  // Convert to 0-based index
            char expectedValue = myScanner.next().charAt(0);
            questions.put(attrIndex, expectedValue);
        }

        // Filter out valid characters
        List<Integer> validCharacters = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String attributes = characters.get(i);
            boolean isValid = true;

            // Check if character satisfies all questions
            for (Map.Entry<Integer, Character> entry : questions.entrySet()) {
                int attrIndex = entry.getKey();
                char expectedValue = entry.getValue();
                if (attributes.charAt(attrIndex) != expectedValue) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                validCharacters.add(i + 1); // Convert back to 1-based index
            }
        }

        // Output result
        if (validCharacters.size() == 1) {
            System.out.println("unique");
            System.out.println(validCharacters.get(0));
        } else {
            System.out.println("ambiguous");
            System.out.println(validCharacters.size());
        }
    }
}
