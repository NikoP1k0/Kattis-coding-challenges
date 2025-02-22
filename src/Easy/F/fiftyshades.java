package Easy.F;

import java.util.Scanner;

public class fiftyshades {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int buttonPackages = myScanner.nextInt();
        myScanner.nextLine();

        int counter = 0;
        for(int i = 0; i < buttonPackages; i++){
            String currentPackage = myScanner.nextLine();
            String normalizedPackage = currentPackage.toLowerCase();

            if(normalizedPackage.contains("pink") || normalizedPackage.contains("rose")){
                counter++;
            }
        }

        System.out.println((counter > 0) ? counter : "I must watch Star Wars with my daughter");
    }
}
