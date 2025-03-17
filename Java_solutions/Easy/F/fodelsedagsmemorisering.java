package Easy.F;

import java.util.*;

class Friend implements Comparable<Friend> {
    String name;
    int rating;

    public Friend(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public int compareTo(Friend other) {
        return this.name.compareTo(other.name);
    }
}
public class fodelsedagsmemorisering {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int friends = myScanner.nextInt();
        myScanner.nextLine();

        Map<String, Friend> bestFriends = new HashMap<>();

        for (int i = 0; i < friends; i++) {
            String name = myScanner.next();
            int rating = myScanner.nextInt();
            String date = myScanner.next();

            if (!bestFriends.containsKey(date) || bestFriends.get(date).rating < rating) {
                bestFriends.put(date, new Friend(name, rating));
            }
        }

        List<Friend> sortedFriends = new ArrayList<>(bestFriends.values());
        Collections.sort(sortedFriends);

        System.out.println(sortedFriends.size());
        for (Friend friend : sortedFriends) {
            System.out.println(friend.name);
        }
    }
}
