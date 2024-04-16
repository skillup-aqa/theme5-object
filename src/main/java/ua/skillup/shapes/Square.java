package ua.skillup.shapes;

import java.util.Objects;

public class Square extends Rectangle {
    public Square(double a) {
        super(a, a);
    }

    @Override
    public String toString() {
        return "Square { " + "side = " + this.getA() +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return getA() == square.getA();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA());
    }

}
