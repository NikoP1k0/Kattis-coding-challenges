package Easy;

import java.util.Scanner;

public class provincesandgold {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfGolds = myScanner.nextInt();
        int numberOfSilvers = myScanner.nextInt();
        int numberOfCoppers = myScanner.nextInt();

        int totalBuyingPower = (numberOfGolds * 3) + (numberOfSilvers * 2) + numberOfCoppers;

        String victoryCard = "";
        if(totalBuyingPower >= 8){
            victoryCard = "Province";
        } else if(totalBuyingPower >= 5){
            victoryCard = "Duchy";
        } else if(totalBuyingPower >= 2) {
            victoryCard = "Estate";
        }

        String treasureCard = "";
        if(totalBuyingPower >= 6){
            treasureCard = "Gold";
        } else if(totalBuyingPower >= 3){
            treasureCard = "Silver";
        } else{
            treasureCard = "Copper";
        }

        if(!victoryCard.isEmpty()){
            System.out.println(victoryCard + " or " + treasureCard);
        } else{
            System.out.println(treasureCard);
        }
    }
}
