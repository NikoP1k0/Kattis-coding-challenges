package Easy.R;

import java.util.*;

public class roknet {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int N = Integer.parseInt(myScanner.nextLine());

        Map<String, Boolean> values = new HashMap<>();
        List<String> outputs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] parts = myScanner.nextLine().split(" ");
            String type = parts[0];

            switch (type) {
                case "INNTAK" -> {
                    String name = parts[1];
                    boolean value = parts[2].equals("SATT");
                    values.put(name, value);
                }
                case "OG" -> {
                    boolean val1 = values.get(parts[1]);
                    boolean val2 = values.get(parts[2]);
                    values.put(parts[3], val1 && val2);
                }
                case "EDA" -> {
                    boolean val1 = values.get(parts[1]);
                    boolean val2 = values.get(parts[2]);
                    values.put(parts[3], val1 || val2);
                }
                case "EKKI" -> {
                    boolean val = values.get(parts[1]);
                    values.put(parts[2], !val);
                }
                case "UTTAK" -> {
                    String name = parts[1];
                    outputs.add(name + " " + (values.get(name) ? "SATT" : "OSATT"));
                }
            }
        }

        // Print results in order of UTTAK appearance
        for (String output : outputs) {
            System.out.println(output);
        }
    }
}
