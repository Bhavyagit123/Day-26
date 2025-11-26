package com.codegnan.stringexamples;

import java.util.Scanner;

public class Rectangle {
	private double length;
    private double width;
    private static final double EPSILON = 1e-9;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Rectangle other = (Rectangle) obj;

        return Math.abs(this.length - other.length) < EPSILON &&
               Math.abs(this.width - other.width) < EPSILON;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length1 = sc.nextDouble();
        double width1 = sc.nextDouble();
        double length2 = sc.nextDouble();
        double width2 = sc.nextDouble();

        Rectangle r1 = new Rectangle(length1, width1);
        Rectangle r2 = new Rectangle(length2, width2);

        if (r1.equals(r2))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }

}
