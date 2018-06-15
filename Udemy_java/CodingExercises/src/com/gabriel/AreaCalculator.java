package com.gabriel;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0d;
        }
        double pi = 3.14159;
        return (radius*radius*pi);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0d;
        }
        return (x*y);
    }
}
