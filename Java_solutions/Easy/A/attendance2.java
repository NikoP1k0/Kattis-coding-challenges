package Easy.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class attendance2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int N = Integer.parseInt(myScanner.nextLine());
        List<String> absentStudents = new ArrayList<>();
        String lastCalledStudent = "";

        for (int i = 0; i < N; i++) {
            String input = myScanner.nextLine();
            if (input.equals("Present!")) {
                lastCalledStudent = "";
            } else {
                if (!lastCalledStudent.isEmpty()) {
                    absentStudents.add(lastCalledStudent);
                }
                lastCalledStudent = input;
            }
        }

        if (!lastCalledStudent.isEmpty()) {
            absentStudents.add(lastCalledStudent);
        }

        if (absentStudents.isEmpty()) {
            System.out.println("No Absences");
        } else {
            for (String student : absentStudents) {
                System.out.println(student);
            }
        }
    }
}
