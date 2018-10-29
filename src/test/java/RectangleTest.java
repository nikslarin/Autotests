import org.junit.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    @Parameterized.Parameter
    public /* NOT private */ double a = 3.0;

    @Parameterized.Parameter
    public /* NOT private */ double b = 2.0;

    @Rule
    public final CustomRule customRule = new CustomRule();


    @Test
    public void testRectangle()
    {
        Rectangle rectangle = new Rectangle();
        double result = rectangle.getArea(a,b);
        assertEquals(6.0, result);
        double result3 = rectangle.getPerimeter(a,b);
        assertEquals(10.0, result3);
    }

    @Test(expected = ArithmeticException.class)
    public void testRectangleException() {
        Rectangle rectangle = new Rectangle();
        double result = rectangle.getArea(-4.0, -1.0);
        assertEquals(50.26548245743669, result);
    }
}
