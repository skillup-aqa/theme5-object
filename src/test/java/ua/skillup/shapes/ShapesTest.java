package ua.skillup.shapes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ShapesTest {
    @DataProvider(name = "perimeterTests")
    public Object[][] perimeterTests() {
        return new Object[][]{
                {new Rectangle(1, 2), 6},
                {new Square(1), 4},
                {new Circle(1), Math.PI * 2},
                {new Triangle(1, 2, 3), 6}
        };
    }

    @Test(dataProvider = "perimeterTests")
    public void testPerimeter(Shape shape, double expectedPerimeter) {
        assertEquals(shape.perimeter(), expectedPerimeter);
    }

    @DataProvider(name = "areaTests")
    public Object[][] areaTests() {
        return new Object[][]{
                {new Rectangle(1, 2), 2},
                {new Square(1), 1},
                {new Circle(1), Math.PI },
                {new Triangle(3, 4, 5), 6}
        };
    }

    @Test(dataProvider = "areaTests")
    public void testArea(Shape shape, double expectedArea) {
        assertEquals(shape.area(), expectedArea);
    }
}
