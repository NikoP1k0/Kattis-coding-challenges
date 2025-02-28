package Easy.N;

import java.util.HashMap;
import java.util.Scanner;

public class nodup {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String line = myScanner.nextLine();
        String[] allWords = line.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String Word : allWords) {
            if (wordCount.containsKey(Word)) {
                int currentCount = wordCount.get(Word);
                wordCount.replace(Word, currentCount + 1);
            } else {
                wordCount.put(Word, 1);
            }
        }

        for(String i : wordCount.keySet()){
            if(wordCount.get(i) > 1){
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
}
