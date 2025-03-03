package Easy.D;

import java.util.*;

public class drinkmenu {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int m = myScanner.nextInt();
        myScanner.nextLine();

        List<String> menu = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            menu.add(myScanner.nextLine());
        }

        Map<String, Integer> customerProgress = new HashMap<>();

        for (int i = 0; i < m; i++) {
            String customer = myScanner.nextLine();
            int drinkIndex = customerProgress.getOrDefault(customer, 0);
            System.out.println(menu.get(drinkIndex));
            customerProgress.put(customer, drinkIndex + 1);
        }
    }
}
