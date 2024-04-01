package ua.skillup.shapes;

public class Square extends Rectangle {
    public Square(double a) {
        super(a, a);
    }

    @Override
    public String toString() {
        return "Square{a=" + this.getA() + '}';
    }
}
