package Easy.H;

import java.io.*;
import java.util.*;

public class hittingtargets {
    static class Rectangle {
        int x1, y1, x2, y2;
        Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = Math.min(x1, x2);  // Ensure x1 is always the min
            this.y1 = Math.min(y1, y2);  // Ensure y1 is always the min
            this.x2 = Math.max(x1, x2);
            this.y2 = Math.max(y1, y2);
        }
        boolean contains(int x, int y) {
            return x >= x1 && x <= x2 && y >= y1 && y <= y2;
        }
    }

    static class Circle {
        int xc, yc, r, rSquared;
        Circle(int xc, int yc, int r) {
            this.xc = xc;
            this.yc = yc;
            this.r = r;
            this.rSquared = r * r; // Precompute r^2
        }
        boolean contains(int x, int y) {
            int dx = x - xc;
            int dy = y - yc;
            return dx * dx + dy * dy <= rSquared;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTargets = Integer.parseInt(br.readLine());

        List<Rectangle> rectangles = new ArrayList<>();
        List<Circle> circles = new ArrayList<>();

        // Read all targets
        for (int i = 0; i < numberOfTargets; i++) {
            String[] parts = br.readLine().split(" ");
            if (parts[0].equals("rectangle")) {
                rectangles.add(new Rectangle(
                        Integer.parseInt(parts[1]),
                        Integer.parseInt(parts[2]),
                        Integer.parseInt(parts[3]),
                        Integer.parseInt(parts[4])
                ));
            } else { // circle
                circles.add(new Circle(
                        Integer.parseInt(parts[1]),
                        Integer.parseInt(parts[2]),
                        Integer.parseInt(parts[3])
                ));
            }
        }

        // Read shots
        int numberOfShots = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(); // Using StringBuilder for efficient output
        for (int i = 0; i < numberOfShots; i++) {
            String[] parts = br.readLine().split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);

            // Count how many targets this shot hits
            int hits = 0;
            for (Rectangle rect : rectangles) {
                if (rect.contains(x, y)) hits++;
            }
            for (Circle circ : circles) {
                if (circ.contains(x, y)) hits++;
            }

            sb.append(hits).append("\n");
        }

        System.out.print(sb.toString()); // Print all output at once for efficiency
    }
}

