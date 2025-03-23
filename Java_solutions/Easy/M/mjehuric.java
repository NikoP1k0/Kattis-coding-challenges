package Easy.M;

import java.util.Scanner;

public class mjehuric {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = myScanner.nextInt();
        }

        // Perform Bubble Sort with output after each swap
        while (!isSorted(arr)) {
            for (int i = 0; i < 4; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    printArray(arr);
                }
            }
        }
    }

    // Function to check if the array is sorted
    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < 4; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Function to print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
