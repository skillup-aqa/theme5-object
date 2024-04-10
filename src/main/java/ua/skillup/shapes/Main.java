package ua.skillup.shapes;

public class Main {

    public static void printShapeInfo(String name, Shape shape) {
        System.out.println("=== " + name + " ===");
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Area: " + shape.area());
        System.out.println();
    }

    public static void printOverrided(Object o1, Object o2) {
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o1);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(5);
        Triangle triangle2 = new Triangle (4,3,5);
        Circle circle2 = new Circle(8);
        Square square2 = new Square(5);
        Rectangle rectangle2 = new Rectangle(5, 4);

        printShapeInfo("Triangle", triangle);
        printShapeInfo("Circle", circle);
        printShapeInfo("Rectangle", rectangle);
        printShapeInfo("Square", square);

        printOverrided(circle, circle2);
        printOverrided(square, square2);
        printOverrided(rectangle, rectangle2);
        printOverrided(triangle, triangle2);


    }
}
