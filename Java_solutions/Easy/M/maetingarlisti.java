package Easy.M;

import java.util.*;

public class maetingarlisti {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int N = myScanner.nextInt();
        int R = myScanner.nextInt();
        int C = myScanner.nextInt();
        myScanner.nextLine();

        String[][] seating = new String[R][C];
        for (int i = 0; i < R; i++) {
            String row = myScanner.nextLine();
            seating[i] = row.split(" ");
        }

        HashMap<String, Integer> attendanceOrder = new HashMap<>();
        for(int i = 0; i < N; i++){
            String name = myScanner.nextLine();
            attendanceOrder.put(name, i);
        }

        for(String[] row : seating){
            int firstNameIndex = attendanceOrder.get(row[0]);  // First name in the row
            int lastNameIndex = attendanceOrder.get(row[C - 1]); // Last name in the row

            // Determine the direction of the attendance list
            if (firstNameIndex < lastNameIndex) {
                System.out.println("left");
            } else {
                System.out.println("right");
            }
        }
    }
}
