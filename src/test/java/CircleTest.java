import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CircleTest {

    @Test
    public void testCircle()
    {
        Circle circle = new Circle();
        double result = circle.getArea(4.0);
        assertEquals(50.26548245743669, result);
        double result2 = circle.getArea(8.1);
        assertEquals(206.1198940020263, result2);
        double result3 = circle.getPerimeter(3.0);
        assertEquals(18.84955592153876, result3);
        double result4 = circle.getPerimeter(6.3);
        assertEquals(39.58406743523139, result4);
    }
}
