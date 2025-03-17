package Easy.T;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class t9spelling {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        myScanner.nextLine();

        // T9 mapping
        Map<Character, String> t9Map = new HashMap<>();
        t9Map.put('a', "2");    t9Map.put('b', "22");   t9Map.put('c', "222");
        t9Map.put('d', "3");    t9Map.put('e', "33");   t9Map.put('f', "333");
        t9Map.put('g', "4");    t9Map.put('h', "44");   t9Map.put('i', "444");
        t9Map.put('j', "5");    t9Map.put('k', "55");   t9Map.put('l', "555");
        t9Map.put('m', "6");    t9Map.put('n', "66");   t9Map.put('o', "666");
        t9Map.put('p', "7");    t9Map.put('q', "77");   t9Map.put('r', "777"); t9Map.put('s', "7777");
        t9Map.put('t', "8");    t9Map.put('u', "88");   t9Map.put('v', "888");
        t9Map.put('w', "9");    t9Map.put('x', "99");   t9Map.put('y', "999");  t9Map.put('z', "9999");
        t9Map.put(' ', "0"); // Space character is mapped to '0'

        for (int t = 1; t <= testCases; t++) {
            String message = myScanner.nextLine();
            StringBuilder result = new StringBuilder("Case #" + t + ": ");

            char lastChar = '\0'; // Use a null character to avoid initial comparison issues
            for (char ch : message.toCharArray()) {
                String keyPress = t9Map.get(ch);

                // Ensure no double spaces
                if (lastChar != '\0' && t9Map.get(lastChar).charAt(0) == keyPress.charAt(0)) {
                    result.append(" ");
                }

                result.append(keyPress);
                lastChar = ch; // Update last character
            }

            System.out.println(result);
        }
    }
}
