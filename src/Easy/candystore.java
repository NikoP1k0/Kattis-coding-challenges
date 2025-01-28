package Easy;

import java.util.Scanner;

public class candystore {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int customers = myScanner.nextInt();
        int numberOfInitials = myScanner.nextInt();
        myScanner.nextLine();


        // Fetch names
        String[] customerNames = new String[customers];
        for (int i = 0; i < customers; i++) {
            customerNames[i] = myScanner.nextLine();
        }

        // Fetch initials
        String[] initials = new String[numberOfInitials];
        for (int i = 0; i < numberOfInitials; i++) {
            initials[i] = myScanner.nextLine();
        }

        // Check if the initial have any matches and if so, who and how many.
        String[] output = new String[numberOfInitials];
        for(int i = 0; i < initials.length; i++){
            String currentInitial = initials[i];
            int nameOccurrenceCounter = 0;
            String loneName = "";

            for(int j = 0; j < customerNames.length; j++){
                String currentName = customerNames[j];
                String[] nameParts = currentName.split(" ");
                if(nameParts[0].charAt(0) == currentInitial.charAt(0) && nameParts[1].charAt(0) == currentInitial.charAt(1)){
                    nameOccurrenceCounter++;
                    loneName = currentName;
                }
            }

            if(nameOccurrenceCounter == 0){
                output[i] = "nobody";
            } else if (nameOccurrenceCounter > 1) {
                output[i] = "ambiguous";
            } else{
                output[i] = loneName;
            }
        }

        for (String result : output) {
            System.out.println(result);
        }
    }
}
