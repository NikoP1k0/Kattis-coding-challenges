package Easy.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Cup implements Comparable<Cup> {
    int size;
    String color;

    public Cup(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public int compareTo(Cup other) {
        return Integer.compare(this.size, other.size);
    }
}

public class cups {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int cups = myScanner.nextInt();
        myScanner.nextLine();

        List<Cup> cupList = new ArrayList<>();

        for (int i = 0; i < cups; i++) {
            String first = myScanner.next();
            String second = myScanner.next();

            int size;
            String color;

            // If first input is a number, it represents the diameter
            if (Character.isDigit(first.charAt(0))) {
                size = Integer.parseInt(first) / 2;  // Diameter -> Radius
                color = second;
            } else {
                color = first;
                size = Integer.parseInt(second);
            }

            cupList.add(new Cup(size, color));
        }

        // Sort cups by size (radius)
        Collections.sort(cupList);
        for (Cup cup : cupList) {
            System.out.println(cup.color);
        }
    }
}
