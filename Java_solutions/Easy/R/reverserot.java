package Easy.R;

import java.util.Scanner;

public class reverserot {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_."; // Define the character mapping
    private static final int ALPHABET_SIZE = ALPHABET.length(); // Length of 28

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        while (myScanner.hasNext()) {
            String line = myScanner.nextLine();
            if (line.equals("0")) break;

            // Split input into rotation number and the message
            String[] parts = line.split(" ");
            int rotation = Integer.parseInt(parts[0]);
            String message = parts[1];

            // Step 1: Reverse the message
            String reversed = new StringBuilder(message).reverse().toString();

            // Step 2: Apply the rotation
            StringBuilder encodedMessage = new StringBuilder();
            for (char c : reversed.toCharArray()) {
                int oldIndex = ALPHABET.indexOf(c);
                int newIndex = (oldIndex + rotation) % ALPHABET_SIZE;
                encodedMessage.append(ALPHABET.charAt(newIndex));
            }

            System.out.println(encodedMessage);
        }
    }
}
