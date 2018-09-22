package day4.practice;


public class Geometry {
    public static int rectangleArea(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException();
        }
        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        System.out.println(rectangleArea(10, 20));
        System.out.println(rectangleArea(30, 20));
        System.out.println(circleArea(10));
        System.out.println(circleArea(20));
        System.out.println(circleArea(-10));

    }
}
