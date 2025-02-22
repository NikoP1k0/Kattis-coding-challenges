package Easy.H;

import java.util.Scanner;

public class hangingout {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int fireSafetyLimit = myScanner.nextInt(); int numberOfEvents = myScanner.nextInt();

        int sumOfPeopleOnTheTerrace = 0;
        int rejectedEventsCounter = 0;
        for(int i = 0; i < numberOfEvents; i++){
            String event = myScanner.next();
            int people = myScanner.nextInt();

            switch(event){
                case "enter":
                    if(sumOfPeopleOnTheTerrace + people <= fireSafetyLimit){
                        sumOfPeopleOnTheTerrace += people;
                    } else {
                        rejectedEventsCounter++;
                    }
                    break;
                case "leave":
                    sumOfPeopleOnTheTerrace -= people;
                    break;
            }
        }

        System.out.println(rejectedEventsCounter);
    }
}
