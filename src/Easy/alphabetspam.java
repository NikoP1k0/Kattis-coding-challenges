package Easy;

import java.util.Scanner;

public class alphabetspam {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String spam = myScanner.nextLine();
        double spamCharCount = 0;
        double blankSpacesCount = 0;
        double lowerCaseCount = 0;
        double upperCaseCount = 0;
        double additionalCharCount = 0;

        for(int i = 0; i < spam.length(); i++){
            spamCharCount++;
            char currentChar = spam.charAt(i);

            switch(currentChar){
                case '_':
                    blankSpacesCount++;
                    break;
                default:
                    if(Character.isLowerCase(currentChar)){
                        lowerCaseCount++;
                    }
                    else if(Character.isUpperCase(currentChar)){
                        upperCaseCount++;
                    } else {
                        additionalCharCount++;
                    }
            }
        }

        System.out.println(blankSpacesCount/spamCharCount);
        System.out.println(lowerCaseCount/spamCharCount);
        System.out.println(upperCaseCount/spamCharCount);
        System.out.println(additionalCharCount/spamCharCount);
    }
}
