package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparisonUC3 {
    static double compareLine(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        double a, b;

        a = (double) Math.floor(Math.sqrt(Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2) * 1.0);
        b = (double) Math.floor(Math.sqrt(Math.pow(x4 - x3, 2)) + Math.pow(y4 - y3, 2) * 1.0);

        if (Double.compare(a,b) == 0) {
            System.out.println("Both lines are equal.");
        } else if (Double.compare(a,b) < 0) {
            System.out.println("Both lines are smaller.");
        } else if (Double.compare(a,b) > 0) {
            System.out.println("Both lines are larger.");
        } else {
            System.out.println("Both lines are not equal.");
        }
        return 0;
    }

    public static void main(String[] args) {
        int x1, x2, x3, x4, y1, y2, y3, y4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter points x1, y1, x2, y2: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        System.out.println("Enter points x3, y3, x4, y4: ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        x4 = sc.nextInt();
        y4 = sc.nextInt();

        compareLine(x1, x2, x3, x4, y1, y2, y3, y4);
    }
}
