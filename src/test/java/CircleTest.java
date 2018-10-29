import org.junit.Test;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

public class CircleTest {

    @Parameterized.Parameter
    public /* NOT private */ double a = 4.0;

    @Test
    public void testCircle() {
        Circle circle = new Circle();
        double result = circle.getArea(a);
        assertEquals(50.26548245743669, result);
        double result4 = circle.getPerimeter(a);
        assertEquals(25.132741228718345, result4);
    }

    @Test(expected = ArithmeticException.class)
    public void testCircleException() {
        Circle circle = new Circle();
        double result = circle.getArea(-4.0);
        assertEquals(50.26548245743669, result);
    }
}
