package Easy.H;

import java.util.Scanner;

public class hvertskalmaeta {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String municipality = myScanner.nextLine();

        switch (municipality) {
            case "Reykjavik", "Kopavogur", "Hafnarfjordur", "Reykjanesbaer", "Gardabaer", "Mosfellsbaer", "Arborg", "Akranes", "Seltjarnarnes" ->
                    System.out.println("Reykjavik");
            case "Akureyri", "Fjardabyggd", "Mulathing" -> System.out.println("Akureyri");
        }
    }
}
