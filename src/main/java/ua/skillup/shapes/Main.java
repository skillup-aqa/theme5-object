package ua.skillup.shapes;

import java.util.concurrent.Callable;

public class Main {

    public static void printShapeInfo(String name, Shape shape) {
        System.out.println("=== " + name + " ===");
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Area: " + shape.area());
        System.out.println();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(5);

        printShapeInfo("Triangle", triangle);
        printShapeInfo("Circle", circle);
        printShapeInfo("Rectangle", rectangle);
        printShapeInfo("Square", square);

        Circle circle2 = new Circle(7);
        System.out.println(circle.equals(circle2));
        System.out.println(circle.hashCode());
        System.out.println(circle + "\n");

        Rectangle rectangle2 = new Rectangle(5, 7);
        System.out.println(rectangle.equals(rectangle2));
        System.out.println(rectangle.hashCode());
        System.out.println(rectangle + "\n");

        Square square2 = new Square(4);
        System.out.println(square.equals(square2));
        System.out.println(square.hashCode());
        System.out.println(square + "\n");


    }
}
