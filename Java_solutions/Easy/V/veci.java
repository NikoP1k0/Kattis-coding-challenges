package Easy.V;

import java.util.Scanner;

public class veci {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.next();

        String result = findNextLargerNumber(input);
        System.out.println(result);
    }

    public static String findNextLargerNumber(String num) {
        char[] digits = num.toCharArray();
        int length = digits.length;

        int i = length - 1;
        while (i > 0 && digits[i - 1] >= digits[i]) {
            i--;
        }

        if (i <= 0) {
            return "0";
        }

        int j = length - 1;
        while (digits[j] <= digits[i - 1]) {
            j--;
        }
        swap(digits, i - 1, j);
        reverse(digits, i, length - 1);

        return new String(digits);
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }
}
