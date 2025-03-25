package Easy.T;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class toktik {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int videos = myScanner.nextInt();
        myScanner.nextLine();

        HashMap<String, Integer> viewMap = new HashMap<>();

        for (int i = 0; i < videos; i++) {
            String name = myScanner.next();
            int views = myScanner.nextInt();
            viewMap.put(name, viewMap.getOrDefault(name, 0) + views);
        }

        String topVideo = "";
        int maxViews = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : viewMap.entrySet()) {
            if (entry.getValue() > maxViews) {
                maxViews = entry.getValue();
                topVideo = entry.getKey();
            }
        }

        System.out.println(topVideo);
    }
}
