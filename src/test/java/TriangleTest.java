import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class TriangleTest {

    @Test
    public void testRectangle()
    {
        Triangle triangle = new Triangle();
        double result = triangle.getArea(4.0, 3.0, 4.0);
        assertEquals(5.562148865321747, result);
        double result2 = triangle.getArea(6.3, 7.4, 6.4);
        assertEquals(19.092730128245154, result2);
        double result3 = triangle.getPerimeter(4.0, 3.0, 4.0);
        assertEquals(11.0, result3);
        double result4 = triangle.getPerimeter(6.3, 7.4, 6.4);
        assertEquals(20.1, result4);
    }
}
