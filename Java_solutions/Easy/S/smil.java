package Easy.S;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class smil {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String sequence = myScanner.nextLine();

        List<Integer> addresses = new ArrayList<>();

        // Patterns to search for
        String[] smiles = {":)", ";)", ":-)", ";-)"};
        for (int i = 0; i < sequence.length(); i++) {
            for (String smile : smiles) {
                if (i + smile.length() <= sequence.length() && sequence.substring(i, i + smile.length()).equals(smile)) {
                    addresses.add(i);
                }
            }
        }

        for (int addr : addresses) {
            System.out.println(addr);
        }
    }
}
