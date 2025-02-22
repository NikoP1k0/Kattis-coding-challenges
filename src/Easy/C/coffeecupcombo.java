package Easy.C;

import java.util.Scanner;

public class coffeecupcombo {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfLectures = myScanner.nextInt();
        int awakeLectures = 0;
        int currentCoffeCount = 0;
        myScanner.nextLine();
        String coffeMachinesAvailable = myScanner.nextLine();

        for(int i = 0; i < numberOfLectures; i++){

            if(coffeMachinesAvailable.charAt(i) == '1'){
                currentCoffeCount = 2;
                awakeLectures++;
            } else {
                if(currentCoffeCount > 0){
                    awakeLectures++;
                    currentCoffeCount--;
                }
            }
        }

        System.out.println(awakeLectures);
    }
}
