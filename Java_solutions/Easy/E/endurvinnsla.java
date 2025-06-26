package Easy.E;

import java.util.Scanner;

public class endurvinnsla {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        String City = myScanner.nextLine();

        double targetPercentage = Double.parseDouble(myScanner.nextLine());
        int items = myScanner.nextInt();
        myScanner.nextLine();

        int nonPlasticGarbage = 0;

        for(int i = 0; i < items; i++){
            String garbage = myScanner.nextLine();

            if(garbage.equals("ekki plast")){
                nonPlasticGarbage++;
            }
        }

        double percentage = (double) nonPlasticGarbage / items;
        System.out.println(percentage <= targetPercentage ? "Jebb" : "Neibb");
    }
}
