package Easy.V;

import java.util.Scanner;

public class vefthjonatjon {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int webServers = myScanner.nextInt();
        myScanner.nextLine();
        int cpuCount = 0, memCount = 0, hddCount = 0;

        for (int i = 0; i < webServers; i++) {
            String parts = myScanner.nextLine();
            if (parts.charAt(0) == 'J') cpuCount++; // CPU count
            if (parts.charAt(2) == 'J') memCount++; // Memory count
            if (parts.charAt(4) == 'J') hddCount++; // Hard drive count
        }

        int maxServers = Math.min(cpuCount, Math.min(memCount, hddCount));
        System.out.println(maxServers);
    }
}
