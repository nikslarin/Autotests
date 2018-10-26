import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    @Test
    public void testRectangle()
    {
        Rectangle rectangle = new Rectangle();
        double result = rectangle.getArea(3.0, 2.0);
        assertEquals(6.0, result);
        double result2 = rectangle.getArea(6.3, 7.4);
        assertEquals(46.62, result2);
        double result3 = rectangle.getPerimeter(3.0, 2.0);
        assertEquals(10.0, result3);
        double result4 = rectangle.getPerimeter(6.3, 7.4);
        assertEquals(27.4, result4);
    }
}
