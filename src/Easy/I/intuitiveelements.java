package Easy.I;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class intuitiveelements {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        myScanner.nextLine();

        for (int i = 0; i < testCases; i++) {
            String elementName = myScanner.nextLine();
            String abbreviation = myScanner.nextLine();

            if (isIntuitive(elementName, abbreviation)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isIntuitive(String elementName, String abbreviation) {
        Set<Character> elementSet = new HashSet<>();

        // Store unique characters from elementName
        for (char c : elementName.toCharArray()) {
            elementSet.add(c);
        }

        // Check if all characters in abbreviation exist in elementSet
        for (char c : abbreviation.toCharArray()) {
            if (!elementSet.contains(c)) {
                return false;
            }
        }
        return true;
    }
}


