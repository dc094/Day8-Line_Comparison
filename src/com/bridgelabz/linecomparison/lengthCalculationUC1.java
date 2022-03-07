package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class lengthCalculationUC1 {

    static double findLength (int x1, int x2, int y1, int y2) {
        double distance;

        distance = Math.floor(Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1)));
        return distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point: ");
        int x1 = sc.nextInt();
        System.out.println("Enter x2 point: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y1 point: ");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 point: ");
        int y2 = sc.nextInt();

        lengthCalculationUC1 length = new lengthCalculationUC1();
        System.out.println("Distance: " + length.findLength(x1,x2,y1,y2));
    }
}
