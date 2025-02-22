package Easy.P;

import java.util.Scanner;

public class pokechat {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String encodingString = myScanner.nextLine();
        String pokemonID = myScanner.nextLine();

        int[] sequence = new int[pokemonID.length() / 3];


        for(int i = 0; i < pokemonID.length(); i += 3){
            String numberString = pokemonID.substring(i, i + 3);
            int number = Integer.parseInt(numberString);
            sequence[i / 3] = number - 1;
        }

        StringBuilder decryptedMessage = new StringBuilder();
        for(int i = 0; i < sequence.length; i++){
            decryptedMessage.append(encodingString.charAt(sequence[i]));
        }

        System.out.println(decryptedMessage);
    }
}
