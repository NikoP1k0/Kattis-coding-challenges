package Easy.D;

import java.util.Scanner;
import java.util.Stack;

public class delimitersoup {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int length = myScanner.nextInt();
        myScanner.nextLine();
        String program = myScanner.nextLine();
        validateProgram(program);
    }

    public static void validateProgram(String program) {
        Stack<Bracket> stack = new Stack<>();

        for (int i = 0; i < program.length(); i++) {
            char ch = program.charAt(i);

            if (ch == ' ') continue;

            // Opening delimiters are pushed onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(new Bracket(ch, i));
            } else if (ch == ')' || ch == ']' || ch == '}') {
                // If stack is empty, unmatched closing delimiter
                if (stack.isEmpty()) {
                    System.out.println(ch + " " + i);
                    return;
                }

                // Check if the top of the stack matches the closing bracket
                Bracket last = stack.pop();
                if (!matches(last.ch, ch)) {
                    System.out.println(ch + " " + i);
                    return;
                }
            }
        }

        System.out.println("ok so far");
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    static class Bracket {
        char ch;
        int index;

        Bracket(char ch, int index) {
            this.ch = ch;
            this.index = index;
        }
    }
}
