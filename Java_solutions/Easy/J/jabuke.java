package Easy.J;

import java.util.Scanner;

public class jabuke {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Read the coordinates of the triangle's vertices
        int x_a = myScanner.nextInt(), y_a = myScanner.nextInt();
        int x_b = myScanner.nextInt(), y_b = myScanner.nextInt();
        int x_c = myScanner.nextInt(), y_c = myScanner.nextInt();

        // Calculate the area of the triangle using the formula
        double triangleArea = Math.abs(((x_a * (y_b - y_c)) + (x_b * (y_c - y_a)) + (x_c * (y_a - y_b))) / 2.0);

        // Read the number of trees
        int trees = myScanner.nextInt();
        int treeCount = 0;

        // Loop over all trees
        for (int i = 0; i < trees; i++) {
            int x = myScanner.nextInt();
            int y = myScanner.nextInt();

            // Calculate the areas of the three smaller triangles formed with the tree
            double area1 = Math.abs(((x_a * (y_b - y)) + (x_b * (y - y_a)) + (x * (y_a - y_b))) / 2.0);
            double area2 = Math.abs(((x_b * (y_c - y)) + (x_c * (y - y_b)) + (x * (y_b - y_c))) / 2.0);
            double area3 = Math.abs(((x_c * (y_a - y)) + (x_a * (y - y_c)) + (x * (y_c - y_a))) / 2.0);

            // If the sum of the areas of the three smaller triangles equals the area of the main triangle,
            // the tree is inside or on the border of the triangle
            if (Math.abs(triangleArea - (area1 + area2 + area3)) < 1e-6) {
                treeCount++;
            }
        }

        System.out.printf("%.1f\n", triangleArea);
        System.out.println(treeCount);
    }
}
