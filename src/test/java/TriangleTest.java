import org.junit.*;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

public class TriangleTest {

    @Parameterized.Parameter
    public /* NOT private */ double a = 6.3;

    @Parameterized.Parameter
    public /* NOT private */ double b = 7.4;

    @Parameterized.Parameter
    public /* NOT private */ double c = 6.4;


    @Test
    public void testTriangle()
    {
        final Triangle triangle = new Triangle();
        double result = triangle.getArea(a, b, c);
        assertEquals(19.092730128245154, result);
        double result4 = triangle.getPerimeter(a, b, c);
        assertEquals(20.1, result4);
    }

    @Test(expected = ArithmeticException.class)
    public void testTriangleException() {
        Triangle triangle = new Triangle();
        double result = triangle.getArea(-4.0, -1.0, -3.5);
        assertEquals(50.26548245743669, result);
    }

}
