package Easy.L;

import java.util.Scanner;

public class litagreining {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int R = myScanner.nextInt();
        int G = myScanner.nextInt();
        int B = myScanner.nextInt();

        System.out.println(getColorName(R, G, B));
    }

    private static String getColorName(int R, int G, int B) {
        if (isBlack(R, G, B)) return "svartur";
        if (isWhite(R, G, B)) return "hvitur";
        if (isGray(R, G, B)) return "grar";
        if (isRed(R, G, B)) return "raudur";
        if (isGreen(R, G, B)) return "graenn";
        if (isBlue(R, G, B)) return "blar";
        if (isYellow(R, G, B)) return "gulur";
        if (isPurple(R, G, B)) return "fjolubleikur";
        if (isCyanish(R, G, B)) return "blagraenn";
        return "othekkt";
    }

    // Helper methods to improve readability
    private static boolean isBlack(int r, int g, int b) {
        return r == 0 && g == 0 && b == 0;
    }

    private static boolean isWhite(int r, int g, int b) {
        return r == 255 && g == 255 && b == 255;
    }

    private static boolean isGray(int r, int g, int b) {
        return r == g && g == b && r > 0 && r < 255;
    }

    private static boolean isRed(int r, int g, int b) {
        return r > g && r > b;
    }

    private static boolean isGreen(int r, int g, int b) {
        return g > r && g > b;
    }

    private static boolean isBlue(int r, int g, int b) {
        return b > r && b > g;
    }

    private static boolean isYellow(int r, int g, int b) {
        return r == g && r > b;
    }

    private static boolean isPurple(int r, int g, int b) {
        return r == b && r > g;
    }

    private static boolean isCyanish(int r, int g, int b) {
        return g > r;  // covers cases like greenish-blue
    }
}
