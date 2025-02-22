package Easy.E;

import java.util.Scanner;

public class ethanol {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int carbonAtoms = myScanner.nextInt();

        String hydrogenAtoms1 = "  " + "H ".repeat(carbonAtoms) + "\n";
        String hydrogenAtoms2 = "  " + "H ".repeat(carbonAtoms);
        String hydrogenLinks = "  " + "| ".repeat(carbonAtoms) + "\n";
        String middleLink = "H" + "-" + "C-".repeat(carbonAtoms) + "OH" + "\n";

        StringBuilder molecule = new StringBuilder();

        for(int i = 0; i < 5; i++){
            switch (i) {
                case 0 -> molecule.append(hydrogenAtoms1);
                case 1, 3 -> molecule.append(hydrogenLinks);
                case 2 -> molecule.append(middleLink);
                case 4 -> molecule.append(hydrogenAtoms2);
            }
        }

        System.out.println(molecule);
    }
}
