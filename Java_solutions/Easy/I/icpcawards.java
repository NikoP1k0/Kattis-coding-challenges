package Easy.I;

import java.util.*;

public class icpcawards {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int teams = myScanner.nextInt();
        myScanner.nextLine();

        LinkedHashSet<String> uniqueUniversities = new LinkedHashSet<>();
        List<String> winners = new ArrayList<>();

        for (int i = 0; i < teams; i++) {
            String teamInfo = myScanner.nextLine();
            String university = teamInfo.split(" ")[0];

            if (!uniqueUniversities.contains(university)) {
                uniqueUniversities.add(university);
                winners.add(teamInfo);
            }

            if (winners.size() == 12) {
                break;
            }
        }

        for (String winner : winners) {
            System.out.println(winner);
        }
    }
}
