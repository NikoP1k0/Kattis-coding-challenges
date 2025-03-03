package Easy.A;

import java.util.*;

public class alphabeticalaristocrats {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int names = Integer.parseInt(myScanner.nextLine());

        List<String> nobleNames = new ArrayList<>();
        Map<String, String> sortingKeys = new HashMap<>();

        for(int i = 0; i < names; i++){
            String name = myScanner.nextLine();
            String sortingKey = extractSortingKey(name);
            nobleNames.add(name);
            sortingKeys.put(name, sortingKey);
        }

        // Sort based on the Dutch rules
        nobleNames.sort(Comparator.comparing(sortingKeys::get));

        // Print sorted names
        for(String name : nobleNames){
            System.out.println(name);
        }
    }

    // Extracts sorting key from a surname
    private static String extractSortingKey(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                return name.substring(i); // Extract from first capital letter onwards
            }
        }
        return name; // Shouldn't happen given constraints, but just in case
    }
}
