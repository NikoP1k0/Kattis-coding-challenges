package Easy.V;

import java.util.Scanner;

public class vedurvindhradi {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double windspeed = myScanner.nextDouble();
        System.out.println(classifyWindSpeed(windspeed));
    }

    public static String classifyWindSpeed(double a) {
        if (a >= 0 && a <= 0.2) {
            return "Logn";
        } else if (a >= 0.3 && a <= 1.5) {
            return "Andvari";
        } else if (a >= 1.6 && a <= 3.3) {
            return "Kul";
        } else if (a >= 3.4 && a <= 5.4) {
            return "Gola";
        } else if (a >= 5.5 && a <= 7.9) {
            return "Stinningsgola";
        } else if (a >= 8.0 && a <= 10.7) {
            return "Kaldi";
        } else if (a >= 10.8 && a <= 13.8) {
            return "Stinningskaldi";
        } else if (a >= 13.9 && a <= 17.1) {
            return "Allhvass vindur";
        } else if (a >= 17.2 && a <= 20.7) {
            return "Hvassvidri";
        } else if (a >= 20.8 && a <= 24.4) {
            return "Stormur";
        } else if (a >= 24.5 && a <= 28.4) {
            return "Rok";
        } else if (a >= 28.5 && a <= 32.6) {
            return "Ofsavedur";
        } else if (a >= 32.7){
            return "Farvidri";
        }
        return null;
    }
}
